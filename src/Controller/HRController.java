package Controller;

import Model.HRModel;
import View.GUI;

import javax.swing.*;

public class HRController {
    HRModel model;
    GUI gui;

    public HRController(HRModel model) {
        this.model = model;
        gui = new GUI(model);
    }

    public void initializeController() {
        gui.init();
        addEventListeners();
    }

    public void addEventListeners() {
        gui.getShowDetailsButton().addActionListener(e -> {
            long employeeID = Long.parseLong(gui.getSelectedEmployeeInTable());
            model.setEmployeeSelectedForDetailedView(employeeID);
        });

        gui.getSearchField().addActionListener(e -> {
            String searchInput = gui.getSearchField().getText();
            if (searchInput.isEmpty()) {
                model.searchAll();
            }
            else if (gui.getRadioButtonID().isSelected()) {
                model.searchByID(searchInput);
            }
            else if (gui.getRadioButtonName().isSelected()) {
                model.searchByName(searchInput);
            }
        });

        gui.getFilterComboBox().addActionListener(e -> {
            String filter = gui.getFilterComboBox().getSelectedItem().toString();
            model.filterByPosition(filter);
        });
    }


}
