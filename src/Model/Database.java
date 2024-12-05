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

    public List<Employee> emptySearch() {
        return employees.values().stream().toList();
    }

    public List<Employee> searchByName(String searchInput) {
        return employees.values().stream().filter(x -> x.getName().contains(searchInput.trim())).collect(Collectors.toList());
    }

    public List<Employee> searchByID(long id) {
        List<Employee> result =  new ArrayList<>();

        if (employees.containsKey(id)) {
            result.add(employees.get(id));
        }
        return result;
    }


    public Map<Long, Employee> getEmployees() {
        return employees;
    }
}