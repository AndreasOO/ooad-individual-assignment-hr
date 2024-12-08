package Controller;

import Controller.StateMachine.ControllerState;
import Controller.StateMachine.HRAdminUserState;
import Controller.StateMachine.LoginState;
import Controller.StateMachine.ManagerUserState;
import Model.HRModel;
import View.HRView;

public class HRController {
    HRModel model;
    HRView view;

    ControllerState state;
    ControllerState loginState;
    ControllerState hrAdminUserState;
    ControllerState ManagerUserState;

    public HRController(HRModel model) {
        this.model = model;
        view = new HRView(model);

        loginState = new LoginState(this, view, model);
        hrAdminUserState = new HRAdminUserState(this, view, model);
        ManagerUserState = new ManagerUserState(this, view, model);

        state = hrAdminUserState;
    }

    public void initializeController() {
        view.init();
        addEventListeners();
    }

    public void addEventListeners() {
        view.getShowDetailsButton().addActionListener(e -> {
            state.showEmployeeDetails();
        });

        view.getSearchField().addActionListener(e -> {
            state.performSearch();
        });

        view.getFilterComboBox().addActionListener(e -> {
            state.applyFilter();
        });
    }


}
