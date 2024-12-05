package Model;

import View.EmployeeDetailsObserver;
import View.SearchResultObserver;

import java.util.ArrayList;
import java.util.List;

public class HRModel {
    Database database;
    Employee employeeSelectedForDetailedView;
    List<Employee> currentSearchResult;
    List<Employee> filteredSearchResult;
    List<EmployeeDetailsObserver> employeeDetailsObservers;
    List<SearchResultObserver> searchResultObservers;

    public HRModel() {
        database = new Database();
        database.initializeDatabase();
        employeeDetailsObservers = new ArrayList<>();
        searchResultObservers = new ArrayList<>();
    }

    public void setEmployeeSelectedForDetailedView() {
        System.out.println("model setting employeeSelectedForDetailedView");
        notifyEmployeeDetailsObservers();
    }

    public void searchByName(String name) {
        System.out.println("model searching by name");
        notifySearchResultObservers();
    }

    public void searchByID(String id) {
        long idLong = Long.parseLong(id);
        System.out.println("model searching by ID");
        notifySearchResultObservers();
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

    public void registerEmployeeDetailsObserver(EmployeeDetailsObserver employeeDetailsObserver) {
        employeeDetailsObservers.add(employeeDetailsObserver);
    }

    public void registerSearchResultObserver(SearchResultObserver searchResultObserver) {
        searchResultObservers.add(searchResultObserver);
    }
}
