package View;

import Model.Employee;
import Model.EmployeeStatistics;
import Model.HRModel;
import Model.Position;

import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class HRView implements EmployeeDetailsObserver, SearchResultObserver, FilterResultObserver, StatisticsObserver {
    private final HRModel hrModel;

    private final JFrame frame;
    private final JPanel mainPanel;

    private final JPanel topPanel;
    private final JLabel searchLabel;
    private final JTextField searchField;
    private final JPanel radioButtonPanel;
    private final ButtonGroup buttonGroup;
    private final JRadioButton radioButtonName;
    private final JRadioButton radioButtonID;
    private final JLabel filterLabel;
    private final JComboBox<String> filterComboBox;
    private final JButton logOutButton;

    private final JPanel centerPanel;
    private final JPanel searchResultPanel;
    private final JTable searchResultTable;
    private final DefaultTableModel searchResultTableModel;
    private final JScrollPane searchResultScrollPane;

    private final JPanel showDetailsMainPanel;
    private final JPanel showDetailsTopPanel;
    private final JButton showDetailsButton;
    private final JPanel showDetailsCenterPanel;
    private final JTextField showDetailsNameTextField;
    private final JTextField showDetailsEmploymentPercentageTextField;
    private final JTextField showDetailsPositionTextField;
    private final JTextField showDetailsEmailTextField;
    private final JTextField showDetailsSalaryTextField;
    private final JTextField showDetailsPhoneTextField;

    // login panel
    private final JPanel loginPanel;
    private final JPanel loginBox;
    private final JLabel loginLabel;
    private final JComboBox<String> loginComboBox;
    private final JButton loginButton;

    // manager view
    private final JPanel showStatisticsMainPanel;
    private final JPanel showStatisticsTopPanel;
    private final JButton showStatisticsButton;
    private final JPanel showStatisticsCenterPanel;

    private final JPanel showStatisticsLeftColumn;
    private final JLabel showStatisticsEmployeesTitleLabel;
    private final JLabel showStatisticsTotalNumberOfEmployeesLabel;
    private final JTextField showStatisticsTotalNumberOfEmployeesTextField;
    private final JLabel showStatisticsGeneralWorkingPercentageLabel;
    private final JTextField showStatisticsGeneralWorkingPercentageTextField;

    private final JPanel showStatisticsMiddleColumn;
    private final JLabel showStatisticsPositionsLabel;

    private final JLabel showStatisticsPositionProductOwnerLabel;
    private final JTextField showStatisticsPositionProductOwnerPercentageTextField;

    private final JLabel showStatisticsPositionDeveloperLabel;
    private final JTextField showStatisticsPositionDeveloperPercentageTextField;

    private final JLabel showStatisticsPositionManagerLabel;
    private final JTextField showStatisticsPositionManagerPercentageTextField;

    private final JLabel showStatisticsPositionHRLabel;
    private final JTextField showStatisticsPositionHRPercentageTextField;

    private final JPanel showStatisticsRightColumn;
    private final JLabel showStatisticsSalariesLabel;
    private final JLabel showStatisticsSalaryHighestLabel;
    private final JTextField showStatisticsSalaryHighestTextField;

    private final JLabel showStatisticsSalaryLowestLabel;
    private final JTextField showStatisticsSalaryLowestTextField;

    private final JLabel showStatisticsSalaryAverageLabel;
    private final JTextField showStatisticsSalaryAverageTextField;




    public HRView(HRModel model) {
        this.hrModel = model;
        hrModel.registerEmployeeDetailsObserver(this);
        hrModel.registerSearchResultObserver(this);
        hrModel.registerFilterResultObserver(this);
        hrModel.registerStatisticsObserver(this);

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
        logOutButton = new JButton("Log out");

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


        loginPanel = new JPanel();
        loginBox = new JPanel();
        loginLabel = new JLabel("Choose user for login", SwingConstants.CENTER);
        loginComboBox = new JComboBox<>(new String[]{"HR Admin", "Manager"});
        loginButton = new JButton("Login");


        showStatisticsMainPanel = new JPanel();
        showStatisticsTopPanel = new JPanel();
        showStatisticsButton = new JButton("Show Statistics");
        showStatisticsCenterPanel = new JPanel();


        showStatisticsLeftColumn = new JPanel();
        showStatisticsLeftColumn.setBorder(new LineBorder(Color.BLACK));
        showStatisticsEmployeesTitleLabel = new JLabel("Employee Statistics", SwingConstants.CENTER);
        showStatisticsTotalNumberOfEmployeesLabel = new JLabel("Total Number of Employees");
        showStatisticsTotalNumberOfEmployeesTextField = new JTextField();
        showStatisticsGeneralWorkingPercentageLabel = new JLabel("General Working Percentage");
        showStatisticsGeneralWorkingPercentageTextField = new JTextField();


        showStatisticsMiddleColumn = new JPanel();
        showStatisticsMiddleColumn.setBorder(new LineBorder(Color.BLACK));
        showStatisticsPositionsLabel = new JLabel("Position Statistics", SwingConstants.CENTER);

        showStatisticsPositionProductOwnerLabel = new JLabel("Product Owner %");
        showStatisticsPositionProductOwnerPercentageTextField =  new JTextField();

        showStatisticsPositionDeveloperLabel = new JLabel("Developer %");
        showStatisticsPositionDeveloperPercentageTextField = new JTextField();

        showStatisticsPositionManagerLabel = new JLabel("Manager %");
        showStatisticsPositionManagerPercentageTextField = new JTextField();

        showStatisticsPositionHRLabel = new JLabel("HR %");
        showStatisticsPositionHRPercentageTextField = new JTextField();



        showStatisticsRightColumn = new JPanel();
        showStatisticsRightColumn.setBorder(new LineBorder(Color.BLACK));
        showStatisticsSalariesLabel = new JLabel("Salary Statistics", SwingConstants.CENTER);

        showStatisticsSalaryHighestLabel = new JLabel("Highest salary");
        showStatisticsSalaryHighestTextField = new JTextField();

        showStatisticsSalaryLowestLabel = new JLabel("Lowest salary");
        showStatisticsSalaryLowestTextField = new JTextField();

        showStatisticsSalaryAverageLabel = new JLabel("Average salary");
        showStatisticsSalaryAverageTextField = new JTextField();

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

        topPanel.setLayout(new GridLayout(1,6));
        topPanel.add(logOutButton);
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


        showStatisticsMainPanel.setLayout(new BorderLayout());
        showStatisticsMainPanel.add(showStatisticsTopPanel, BorderLayout.NORTH);
        showStatisticsTopPanel.setLayout(new GridLayout(1,1));
        showStatisticsTopPanel.add(showStatisticsButton, BorderLayout.NORTH);

        showStatisticsMainPanel.add(showStatisticsCenterPanel);

        showStatisticsCenterPanel.setLayout(new GridLayout(1,3));

        showStatisticsCenterPanel.add(showStatisticsLeftColumn);
        showStatisticsLeftColumn.setLayout(new GridLayout(9,1));
        showStatisticsLeftColumn.add(showStatisticsEmployeesTitleLabel);
        showStatisticsLeftColumn.add(showStatisticsTotalNumberOfEmployeesLabel);
        showStatisticsLeftColumn.add(showStatisticsTotalNumberOfEmployeesTextField);
        showStatisticsLeftColumn.add(showStatisticsGeneralWorkingPercentageLabel);
        showStatisticsLeftColumn.add(showStatisticsGeneralWorkingPercentageTextField);

        showStatisticsCenterPanel.add(showStatisticsMiddleColumn);
        showStatisticsMiddleColumn.setLayout(new GridLayout(9,1));
        showStatisticsMiddleColumn.add(showStatisticsPositionsLabel);
        showStatisticsMiddleColumn.add(showStatisticsPositionProductOwnerLabel);
        showStatisticsMiddleColumn.add(showStatisticsPositionProductOwnerPercentageTextField);
        showStatisticsMiddleColumn.add(showStatisticsPositionDeveloperLabel);
        showStatisticsMiddleColumn.add(showStatisticsPositionDeveloperPercentageTextField);
        showStatisticsMiddleColumn.add(showStatisticsPositionManagerLabel);
        showStatisticsMiddleColumn.add(showStatisticsPositionManagerPercentageTextField);
        showStatisticsMiddleColumn.add(showStatisticsPositionHRLabel);
        showStatisticsMiddleColumn.add(showStatisticsPositionHRPercentageTextField);

        showStatisticsCenterPanel.add(showStatisticsRightColumn);
        showStatisticsRightColumn.setLayout(new GridLayout(9,1));
        showStatisticsRightColumn.add(showStatisticsSalariesLabel);
        showStatisticsRightColumn.add(showStatisticsSalaryHighestLabel);
        showStatisticsRightColumn.add(showStatisticsSalaryHighestTextField);
        showStatisticsRightColumn.add(showStatisticsSalaryLowestLabel);
        showStatisticsRightColumn.add(showStatisticsSalaryLowestTextField);
        showStatisticsRightColumn.add(showStatisticsSalaryAverageLabel);
        showStatisticsRightColumn.add(showStatisticsSalaryAverageTextField);


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

    public void showHRAdminView() {
        mainPanel.removeAll();
        mainPanel.add(topPanel, BorderLayout.NORTH);
        centerPanel.removeAll();
        centerPanel.add(searchResultPanel);
        centerPanel.add(showDetailsMainPanel);
        mainPanel.add(centerPanel, BorderLayout.CENTER);
        frame.revalidate();
        frame.repaint();
    }

    public void showManagerView() {
        mainPanel.removeAll();
        mainPanel.add(topPanel, BorderLayout.NORTH);
        centerPanel.removeAll();
        centerPanel.add(searchResultPanel);
        centerPanel.add(showStatisticsMainPanel);
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

    @Override
    public void updateStatistics() {
        EmployeeStatistics stats = hrModel.getStatistics();
        showStatisticsTotalNumberOfEmployeesTextField.setText(String.format("%d",stats.getNumberOfEmployees()));
        showStatisticsGeneralWorkingPercentageTextField.setText(String.format("%.2f",stats.getAverageWorkingPercentage())); //
        showStatisticsPositionProductOwnerPercentageTextField.setText(String.format("%.2f",stats.getPositionPercentages().getOrDefault(Position.PRODUCT_OWNER, 0.00)));
        showStatisticsPositionDeveloperPercentageTextField.setText(String.format("%.2f",stats.getPositionPercentages().getOrDefault(Position.DEVELOPER, 0.00)));
        showStatisticsPositionManagerPercentageTextField.setText(String.format("%.2f",stats.getPositionPercentages().getOrDefault(Position.MANAGER, 0.00)));
        showStatisticsPositionHRPercentageTextField.setText(String.format("%.2f",stats.getPositionPercentages().getOrDefault(Position.HR, 0.00)));
        showStatisticsSalaryHighestTextField.setText(String.format("%.0f",stats.getSalaryStatistics().getMax())); //
        showStatisticsSalaryLowestTextField.setText(String.format("%.0f",stats.getSalaryStatistics().getMin())); //
        showStatisticsSalaryAverageTextField.setText(String.format("%.0f",stats.getSalaryStatistics().getAverage()));


    }

    public void resetTable() {
        searchResultTableModel.setRowCount(0);
    }

    public String getSelectedEmployeeInTable() {
        int row = searchResultTable.getSelectedRow();
        return searchResultTable.getValueAt(row,0).toString();
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


    public JButton getShowDetailsButton() {
        return showDetailsButton;
    }


    public JComboBox<String> getLoginComboBox() {
        return loginComboBox;
    }

    public JButton getShowStatisticsButton() {
        return showStatisticsButton;
    }

    public JButton getLoginButton() {
        return loginButton;
    }

    public JButton getLogOutButton() {
        return logOutButton;
    }
}
