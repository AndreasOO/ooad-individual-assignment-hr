import Controller.HRController;
import Model.Database;
import Model.Employee;
import Model.HRModel;
import Model.Position;
import View.GUI;

public class Main {
    public static void main(String[] args) {
        HRModel model = new HRModel();

        HRController controller = new HRController(model);
        controller.initializeController();

 }
}