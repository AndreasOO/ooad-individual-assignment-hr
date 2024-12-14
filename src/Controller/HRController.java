package Controller;

import Controller.StateMachine.*;
import Model.HRModel;
import View.HRView;

public class HRController {
    private final HRModel model;
    private final HRView view;
    private User userLoggedIn;

    private ControllerState state;
    private final ControllerState loginState;
    private final ControllerState hrAdminUserState;
    private final ControllerState managerUserState;

    public HRController(HRModel model) {
        this.model = model;
        view = new HRView(model);

        loginState = new LoginState(this, view, model);
        hrAdminUserState = new HRAdminUserState(this, view, model);
        managerUserState = new ManagerUserState(this, view, model);

        state = loginState;

    }

    public void initializeController() {
        view.init();
        state.updateView();
        addEventListeners();
    }

    private void addEventListeners() {
        view.getShowDetailsButton().addActionListener(e -> {
            state.showEmployeeDetails();
        });

        view.getSearchField().addActionListener(e -> {
            state.performSearch();
        });

        view.getFilterComboBox().addActionListener(e -> {
            state.applyFilter();
        });
        view.getLoginButton().addActionListener(e -> {
            setUser(view.getLoginComboBox().getSelectedItem().toString());
            state.loginUser();
            state.updateView();
        });

        view.getLogOutButton().addActionListener(e -> {
            userLoggedIn = User.NONE;
            state.logoutUser();
            state.updateView();
        });

        view.getShowStatisticsButton().addActionListener(e -> {
            state.showStatistics();
        });

    }


    private void setUser(String user) {
        switch (user) {
            case "Manager" -> userLoggedIn = User.MANAGER;
            case "HR Admin" -> userLoggedIn = User.HR_ADMIN;
        }
    }

    public User getUser() {
        return userLoggedIn;
    }

    public void changeToHRAdminState() {
        state = hrAdminUserState;
    }

    public void changeToManagerUserState() {
        state = managerUserState;
    }

    public void changeToLoginState() {
        state = loginState;
    }
}
