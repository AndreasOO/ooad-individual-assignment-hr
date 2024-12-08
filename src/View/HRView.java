package View;

import Model.Employee;
import Model.HRModel;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class HRView implements EmployeeDetailsObserver, SearchResultObserver, FilterResultObserver {
    HRModel hrModel;

    JFrame frame;
    JPanel mainPanel;

    JPanel topPanel;
    JLabel searchLabel;
    JTextField searchField;
    JPanel radioButtonPanel;
    ButtonGroup buttonGroup;
    JRadioButton radioButtonName;
    JRadioButton radioButtonID;
    JLabel filterLabel;
    JComboBox<String> filterComboBox;

    JPanel centerPanel;
    JPanel searchResultPanel;
    JTable searchResultTable;
    DefaultTableModel searchResultTableModel;
    JScrollPane searchResultScrollPane;

    JPanel showDetailsMainPanel;
    JPanel showDetailsTopPanel;
    JButton showDetailsButton;
    JPanel showDetailsCenterPanel;
    JTextField showDetailsNameTextField;
    JTextField showDetailsEmploymentPercentageTextField;
    JTextField showDetailsPositionTextField;
    JTextField showDetailsEmailTextField;
    JTextField showDetailsSalaryTextField;
    JTextField showDetailsPhoneTextField;

    // login panel
    JPanel loginPanel;
    JPanel loginBox;
    JLabel loginLabel;
    JComboBox<String> loginComboBox;
    JButton loginButton;


    public HRView(HRModel model) {
        this.hrModel = model;
        hrModel.registerEmployeeDetailsObserver(this);
        hrModel.registerSearchResultObserver(this);
        hrModel.registerFilterResultObserver(this);

        frame = new JFrame();
        mainPanel = new JPanel();

        topPanel = new JPanel();
        searchLabel = new JLabel("Search  ", SwingConstants.RIGHT);
        searchField = new JTextField();
        radioButtonPanel = new JPanel();
        buttonGroup  = new ButtonGroup();
        radioButtonName = new JRadioButton("Name");
        radioButtonID = new JRadioButton("ID");
        filterLabel = new JLabel("Filter      ", SwingConstants.RIGHT);
        filterComboBox = new JComboBox<>(new String[]{"None", "Developer", "Manager", "HR", "Product Owner"});

        centerPanel = new JPanel();
        searchResultPanel = new JPanel();
        searchResultTableModel = new DefaultTableModel();
        searchResultTable = new JTable(searchResultTableModel);
        searchResultTableModel.addColumn("ID");
        searchResultTableModel.addColumn("Name");
        searchResultTableModel.addColumn("Position");


        searchResultScrollPane = new JScrollPane(searchResultTable);
        showDetailsMainPanel = new JPanel();
        showDetailsTopPanel = new JPanel();
        showDetailsButton = new JButton("Show Details");
        showDetailsCenterPanel = new JPanel();
        showDetailsNameTextField = new JTextField();
        showDetailsEmploymentPercentageTextField = new JTextField();
        showDetailsPositionTextField = new JTextField();
        showDetailsEmailTextField = new JTextField();
        showDetailsSalaryTextField = new JTextField();
        showDetailsPhoneTextField = new JTextField();


        // login panel

        loginPanel = new JPanel();
        loginBox = new JPanel();
        loginLabel = new JLabel("Choose user for login", SwingConstants.CENTER);
        loginComboBox = new JComboBox<>(new String[]{"HR Admin", "Manager"});
        loginButton = new JButton("Login");
    }

    public void init() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.add(mainPanel);

        mainPanel.setLayout(new BorderLayout());
        mainPanel.add(topPanel, BorderLayout.NORTH);
        mainPanel.add(centerPanel, BorderLayout.CENTER);


        radioButtonName.setSelected(true);
        buttonGroup.add(radioButtonName);
        buttonGroup.add(radioButtonID);
        radioButtonPanel.setLayout(new GridLayout(2, 1));
        radioButtonPanel.add(radioButtonName);
        radioButtonPanel.add(radioButtonID);

        topPanel.setLayout(new GridLayout(1,5));
        topPanel.add(searchLabel);
        topPanel.add(searchField);
        topPanel.add(radioButtonPanel);
        topPanel.add(filterLabel);
        topPanel.add(filterComboBox);

        centerPanel.setLayout(new GridLayout(2,1));
        centerPanel.add(searchResultPanel);
        centerPanel.add(showDetailsMainPanel);

        searchResultPanel.setLayout(new GridLayout(1,1));
        searchResultPanel.add(searchResultScrollPane);
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        searchResultTable.setDefaultRenderer(Object.class, centerRenderer);


        showDetailsMainPanel.setLayout(new BorderLayout());
        showDetailsMainPanel.add(showDetailsTopPanel, BorderLayout.NORTH);
        showDetailsTopPanel.setLayout(new GridLayout(1,1));
        showDetailsTopPanel.add(showDetailsButton, BorderLayout.NORTH);

        showDetailsMainPanel.add(showDetailsCenterPanel);
        showDetailsCenterPanel.setLayout(new GridLayout(4,3));
        showDetailsCenterPanel.add(new JLabel("Name"));
        showDetailsCenterPanel.add(new JLabel("Employment Percentage"));
        showDetailsCenterPanel.add(new JLabel("Position"));
        showDetailsCenterPanel.add(showDetailsNameTextField);
        showDetailsCenterPanel.add(showDetailsEmploymentPercentageTextField);
        showDetailsCenterPanel.add(showDetailsPositionTextField);
        showDetailsCenterPanel.add(new JLabel("Email"));
        showDetailsCenterPanel.add(new JLabel("Salary"));
        showDetailsCenterPanel.add(new JLabel("Phone number"));
        showDetailsCenterPanel.add(showDetailsEmailTextField);
        showDetailsCenterPanel.add(showDetailsSalaryTextField);
        showDetailsCenterPanel.add(showDetailsPhoneTextField);


        //TODO add statistic details main panel - remove/add from centerPanel when switching between users

        // login init

        loginPanel.setLayout(new GridLayout(3,3));

        loginPanel.add(new JPanel());
        loginPanel.add(new JPanel());
        loginPanel.add(new JPanel());
        loginPanel.add(new JPanel());

        loginPanel.add(loginBox);

        loginPanel.add(new JPanel());
        loginPanel.add(new JPanel());
        loginPanel.add(new JPanel());
        loginPanel.add(new JPanel());



        loginBox.setLayout(new GridLayout(3,1));
        loginBox.add(loginLabel);
        loginBox.add(loginComboBox);
        loginBox.add(loginButton);


    }

    public void showUserLoginView() {
        mainPanel.removeAll();
        mainPanel.add(loginPanel);
        frame.revalidate();
        frame.repaint();
    }

    public void showTableView() {
        mainPanel.removeAll();
        mainPanel.add(topPanel, BorderLayout.NORTH);
        mainPanel.add(centerPanel, BorderLayout.CENTER);
        frame.revalidate();
        frame.repaint();
    }

    public void addEmployeeRow(Employee employee) {
        searchResultTableModel.addRow(new String[]{String.valueOf(employee.getId()), employee.getName(), employee.getPosition().title});
    }

    public void showEmployeeDetails(Employee employee) {
        showDetailsNameTextField.setText(employee.getName());
        showDetailsEmploymentPercentageTextField.setText(String.valueOf(employee.getWorkingPercentage()));
        showDetailsPositionTextField.setText(employee.getPosition().title);
        showDetailsEmailTextField.setText(employee.getEmail());
        showDetailsSalaryTextField.setText(String.valueOf(employee.getSalary()));
        showDetailsPhoneTextField.setText(String.valueOf(employee.getPhoneNumber()));
    }

    @Override
    public void updateEmployeeDetails() {
        showEmployeeDetails(hrModel.getEmployeeSelectedForDetailedView());
    }

    @Override
    public void updateSearchResult() {
        resetTable();
        hrModel.getCurrentSearchResult().forEach(this::addEmployeeRow);
    }
    @Override
    public void updateFilterResult() {
        resetTable();
        hrModel.getFilteredSearchResult().forEach(this::addEmployeeRow);
    }

    private void resetTable() {
        searchResultTableModel.setRowCount(0);
    }

    public String getSelectedEmployeeInTable() {
        int row = searchResultTable.getSelectedRow();
        return searchResultTable.getValueAt(row,0).toString();
    }


    public JFrame getFrame() {
        return frame;
    }

    public JTextField getSearchField() {
        return searchField;
    }

    public JRadioButton getRadioButtonName() {
        return radioButtonName;
    }

    public JRadioButton getRadioButtonID() {
        return radioButtonID;
    }

    public JComboBox<String> getFilterComboBox() {
        return filterComboBox;
    }

    public JTable getSearchResultTable() {
        return searchResultTable;
    }

    public JButton getShowDetailsButton() {
        return showDetailsButton;
    }

    public JTextField getShowDetailsNameTextField() {
        return showDetailsNameTextField;
    }

    public JTextField getShowDetailsEmploymentPercentageTextField() {
        return showDetailsEmploymentPercentageTextField;
    }

    public JTextField getShowDetailsPositionTextField() {
        return showDetailsPositionTextField;
    }

    public JTextField getShowDetailsEmailTextField() {
        return showDetailsEmailTextField;
    }

    public JTextField getShowDetailsSalaryTextField() {
        return showDetailsSalaryTextField;
    }

    public JTextField getShowDetailsPhoneTextField() {
        return showDetailsPhoneTextField;
    }

    public JComboBox<String> getLoginComboBox() {
        return loginComboBox;
    }

    public JButton getLoginButton() {
        return loginButton;
    }
}
