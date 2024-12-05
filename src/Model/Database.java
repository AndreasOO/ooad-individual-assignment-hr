package Model;

import java.util.ArrayList;
import java.util.List;

public class Database {
    List<Employee> employees;

    public Database() {
        employees = initializeDatabase();
    }

    public List<Employee> initializeDatabase() {
        return DataLoader.loadData();
    }

    public List<Employee> getEmployees() {
        return employees;
    }
}
