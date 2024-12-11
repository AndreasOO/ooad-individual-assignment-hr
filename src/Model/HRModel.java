package Model;

import View.EmployeeDetailsObserver;
import View.FilterResultObserver;
import View.SearchResultObserver;
import View.StatisticsObserver;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class HRModel {
    Database database;
    Employee employeeSelectedForDetailedView;
    List<Employee> currentSearchResult;
    List<Employee> filteredSearchResult;
    List<EmployeeDetailsObserver> employeeDetailsObservers;
    List<SearchResultObserver> searchResultObservers;
    List<FilterResultObserver> filterResultObservers;
    List<StatisticsObserver> statisticsObservers;
    EmployeeStatistics statistics;

    public HRModel() {
        database = new Database();
        database.initializeDatabase();
        employeeDetailsObservers = new ArrayList<>();
        searchResultObservers = new ArrayList<>();
        filterResultObservers = new ArrayList<>();
        statisticsObservers = new ArrayList<>();
        statistics = new EmployeeStatistics();
    }

    public void setEmployeeSelectedForDetailedView(long employeeID) {
        employeeSelectedForDetailedView = database.searchByID(employeeID).getFirst();
        notifyEmployeeDetailsObservers();
    }

    public void searchAll() {
        currentSearchResult = database.searchAll();
        filteredSearchResult = currentSearchResult;
        notifySearchResultObservers();

    }

    public void searchByName(String name) {
        currentSearchResult = database.searchByName(name);
        filteredSearchResult = currentSearchResult;
        notifySearchResultObservers();
    }

    public void searchByID(String id) {
        long idLong = Long.parseLong(id);
        currentSearchResult = database.searchByID(idLong);
        filteredSearchResult = currentSearchResult;
        notifySearchResultObservers();
    }

    public void filterByPosition(String filter) {
        if (filter.equals("None")) {
            filteredSearchResult = currentSearchResult;
        } else {
            filteredSearchResult = currentSearchResult.stream().filter(employee -> employee.getPosition().title.equals(filter)).collect(Collectors.toList());
        }
        notifyFilterResultObservers();
    }

    public void extractStatistics() {
        statistics.setNumberOfEmployees(filteredSearchResult.size());
        statistics.setAverageWorkingPercentage((double)(filteredSearchResult.stream()
                                                                            .flatMapToInt(employee -> IntStream.of(employee.getWorkingPercentage()))
                                                                            .sum())/filteredSearchResult.size());
        statistics.setPositionPercentages(calculatePositionPercentages());
        statistics.setSalaryStatistics(filteredSearchResult.stream()
                                                           .flatMapToDouble(employee -> DoubleStream.of(employee.getSalary()))
                                                           .summaryStatistics());

        notifyStatisticsObservers();
    }

    private Map<Position, Double> calculatePositionPercentages() {
        Map<Position, Long> countingMap = filteredSearchResult.stream()

                                                              .collect(Collectors.groupingBy(Employee::getPosition, Collectors.counting()));
        return countingMap.entrySet().stream()
                                     .collect(Collectors.toMap(Map.Entry::getKey, entry -> 100*(double) entry.getValue()/filteredSearchResult.size()));

    }

    public void notifyEmployeeDetailsObservers() {
        for (EmployeeDetailsObserver employeeDetailsObserver : employeeDetailsObservers) {
            employeeDetailsObserver.updateEmployeeDetails();
        }
    }

    public void notifySearchResultObservers() {
        for (SearchResultObserver searchResultObserver : searchResultObservers) {
            searchResultObserver.updateSearchResult();
        }
    }

    public void notifyFilterResultObservers() {
        for (FilterResultObserver filterResultObserver : filterResultObservers) {
            filterResultObserver.updateFilterResult();
        }
    }

    public void notifyStatisticsObservers() {
        for (StatisticsObserver statisticsObserver : statisticsObservers) {
            statisticsObserver.updateStatistics();
        }
    }

    public void registerEmployeeDetailsObserver(EmployeeDetailsObserver employeeDetailsObserver) {
        employeeDetailsObservers.add(employeeDetailsObserver);
    }

    public void registerSearchResultObserver(SearchResultObserver searchResultObserver) {
        searchResultObservers.add(searchResultObserver);
    }

    public void registerFilterResultObserver(FilterResultObserver filterResultObserver) {
        filterResultObservers.add(filterResultObserver);
    }

    public void registerStatisticsObserver(StatisticsObserver statisticsObserver) {
        statisticsObservers.add(statisticsObserver);
    }


    public Employee getEmployeeSelectedForDetailedView() {
        return employeeSelectedForDetailedView;
    }

    public List<Employee> getCurrentSearchResult() {
        return currentSearchResult;
    }

    public List<Employee> getFilteredSearchResult() {
        return filteredSearchResult;
    }

    public EmployeeStatistics getStatistics() {
        return statistics;
    }

    public void clearSearchHistory() {
        employeeSelectedForDetailedView = null;
        currentSearchResult = null;
        filteredSearchResult = null;
    }
}
