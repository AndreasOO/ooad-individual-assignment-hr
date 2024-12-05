import Model.Database;
import Model.Employee;
import Model.Position;
import View.GUI;

public class Main {
    public static void main(String[] args) {
//        GUI gui = new GUI();
//        gui.init();

    Database database = new Database();
//    database.getEmployees().entrySet().forEach(e -> {System.out.println("ID: " + e.getKey() + "  Name: " + e.getValue().getName());});

//        database.searchByID(1).forEach(e -> System.out.println(e.getName()));

//        database.searchByName("Andy").forEach(e -> System.out.println(e.getName()));
        database.emptySearch().forEach(e -> System.out.println(e.getName()));
 }
}