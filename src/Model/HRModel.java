package Model;

import View.EmployeeDetailsObserver;
import View.FilterResultObserver;
import View.SearchResultObserver;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class HRModel {
    Database database;
    Employee employeeSelectedForDetailedView;
    List<Employee> currentSearchResult;
    List<Employee> filteredSearchResult;
    List<EmployeeDetailsObserver> employeeDetailsObservers;
    List<SearchResultObserver> searchResultObservers;
    List<FilterResultObserver> filterResultObservers;

    public HRModel() {
        database = new Database();
        database.initializeDatabase();
        employeeDetailsObservers = new ArrayList<>();
        searchResultObservers = new ArrayList<>();
        filterResultObservers = new ArrayList<>();
    }

    public void setEmployeeSelectedForDetailedView(long employeeID) {
        employeeSelectedForDetailedView = database.searchByID(employeeID).getFirst();
        notifyEmployeeDetailsObservers();
    }

    public void searchAll() {
        currentSearchResult = database.searchAll();
        notifySearchResultObservers();

    }

    public void searchByName(String name) {
        currentSearchResult = database.searchByName(name);
        notifySearchResultObservers();
    }

    public void searchByID(String id) {
        long idLong = Long.parseLong(id);
        currentSearchResult = database.searchByID(idLong);
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

    public void registerEmployeeDetailsObserver(EmployeeDetailsObserver employeeDetailsObserver) {
        employeeDetailsObservers.add(employeeDetailsObserver);
    }

    public void registerSearchResultObserver(SearchResultObserver searchResultObserver) {
        searchResultObservers.add(searchResultObserver);
    }

    public void registerFilterResultObserver(FilterResultObserver filterResultObserver) {
        filterResultObservers.add(filterResultObserver);
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

    public void clearSearchHistory() {
        employeeSelectedForDetailedView = null;
        currentSearchResult = null;
        filteredSearchResult = null;
    }
}
