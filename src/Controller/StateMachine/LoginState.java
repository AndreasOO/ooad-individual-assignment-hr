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
        throw new UnsupportedOperationException("Cannot search from logged out state");
    }

    @Override
    public void applyFilter() {
        throw new UnsupportedOperationException("Cannot filter from logged out state");
    }

    @Override
    public void showEmployeeDetails() {
        throw new UnsupportedOperationException("Cannot show details from logged out state");
    }

    @Override
    public void showStatistics() {
        throw new UnsupportedOperationException("Cannot show statistics from logged out state");
    }

    @Override
    public void loginUser() {
        switch (controller.getUser()) {
            case HR_ADMIN -> controller.changeToHRAdminState();
            case MANAGER -> controller.changeToManagerUserState();
        }
    }

    @Override
    public void logoutUser() {
        throw new UnsupportedOperationException("Cannot logout from logged out state");
    }

    @Override
    public void updateView() {
        view.showUserLoginView();
    }
}
