package Controller.StateMachine;

import Controller.HRController;
import Model.HRModel;
import View.HRView;

public class ManagerUserState implements ControllerState {
    private final HRController controller;
    private final HRView view;
    private final HRModel model;

    public ManagerUserState(HRController controller, HRView view, HRModel model) {
        this.controller = controller;
        this.view = view;
        this.model = model;
    }

    @Override
    public void performSearch() {
        String searchInput = view.getSearchField().getText();
        if (searchInput.isEmpty()) {
            model.searchAll();
        }
        else if (view.getRadioButtonID().isSelected()) {
            model.searchByID(searchInput);
        }
        else if (view.getRadioButtonName().isSelected()) {
            model.searchByName(searchInput);
        }
    }

    @Override
    public void applyFilter() {
        String filter = view.getFilterComboBox().getSelectedItem().toString();
        model.filterByPosition(filter);
    }

    @Override
    public void showEmployeeDetails() {
        throw new UnsupportedOperationException("Cannot show details");
    }

    @Override
    public void showStatistics() {
        model.extractStatistics();
    }

    @Override
    public void loginUser() {
        throw new UnsupportedOperationException("Cannot login from logged in state");
    }

    @Override
    public void logoutUser() {
        model.clearSearchHistory();
        controller.changeToLoginState();
    }

    @Override
    public void updateView() {
        view.resetTable();
        view.showManagerView();
    }
}
