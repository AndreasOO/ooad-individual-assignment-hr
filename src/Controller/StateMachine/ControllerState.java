package Controller.StateMachine;

public interface ControllerState {
    void performSearch();
    void applyFilter();
    void showEmployeeDetails();
    void showStatistics();
    void loginUser();
    void updateView();
}
