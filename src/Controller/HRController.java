package Controller;

import Model.HRModel;
import View.GUI;

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
            model.setEmployeeSelectedForDetailedView(); // get id from selected row cell 0 and pass in.
        });

        gui.getSearchField().addActionListener(e -> {
            if (gui.getRadioButtonID().isSelected()) {
                model.searchByID("1");
            }
            else if (gui.getRadioButtonName().isSelected()) {
                model.searchByName(gui.getSearchField().getText());
            }
        });
    }


}
