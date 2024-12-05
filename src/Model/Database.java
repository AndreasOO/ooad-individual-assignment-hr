package Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Database {
    Map<Long, Employee> employees;

    public Database() {
        employees = initializeDatabase();
    }

    public Map<Long, Employee> initializeDatabase() {
        return DataLoader.loadData().stream().collect(Collectors.toMap(Employee::getId, Function.identity()));
    }

    public Map<Long, Employee> getEmployees() {
        return employees;
    }
}
