package Controller.StateMachine;

import Controller.HRController;
import Model.HRModel;
import View.HRView;

public class LoginState implements ControllerState {
    HRController controller;
    HRView view;
    HRModel model;

    public LoginState(HRController controller, HRView view, HRModel model) {
        this.controller = controller;
        this.view = view;
        this.model = model;
    }

    @Override
    public void performSearch() {

    }

    @Override
    public void applyFilter() {

    }

    @Override
    public void showEmployeeDetails() {

    }

    @Override
    public void showStatistics() {

    }

    @Override
    public void loginUser() {

    }

    @Override
    public void updateView() {
        // hide mainpanel
        // show loginPanel
    }
}
