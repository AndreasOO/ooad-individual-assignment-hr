package Controller.StateMachine;

import Controller.HRController;
import Model.HRModel;
import View.HRView;

public class ManagerUserState implements ControllerState {
    HRController controller;
    HRView view;
    HRModel model;

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
        // add method in model and add observer
    }

    @Override
    public void loginUser() {
        throw new UnsupportedOperationException("Cannot login from logged in state");
    }

    @Override
    public void updateView() {
        view.showManagerView();
    }
}