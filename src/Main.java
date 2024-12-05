import Model.Database;
import Model.Employee;
import Model.Position;
import View.GUI;

public class Main {
    public static void main(String[] args) {
        GUI gui = new GUI();
        gui.init();

    Database database = new Database();
    database.getEmployees().values().forEach(employee -> gui.addEmployeeRow(employee));
    Employee employee = database.searchByID(1).getFirst();

    gui.showEmployeeDetails(employee);
 }
}