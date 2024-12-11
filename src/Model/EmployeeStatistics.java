package Model;

import java.util.DoubleSummaryStatistics;
import java.util.Map;

public class EmployeeStatistics {
    private int numberOfEmployees;
    private double averageWorkingPercentage;
    private Map<Position, Double> positionPercentages;
    private DoubleSummaryStatistics salaryStatistics;
    public EmployeeStatistics() {};

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    protected void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    public double getAverageWorkingPercentage() {
        return averageWorkingPercentage;
    }

    protected void setAverageWorkingPercentage(double averageWorkingPercentage) {
        this.averageWorkingPercentage = averageWorkingPercentage;
    }

    public Map<Position, Double> getPositionPercentages() {
        return positionPercentages;
    }

    protected void setPositionPercentages(Map<Position, Double> positionPercentages) {
        this.positionPercentages = positionPercentages;
    }

    public DoubleSummaryStatistics getSalaryStatistics() {
        return salaryStatistics;
    }

    protected void setSalaryStatistics(DoubleSummaryStatistics salaryStatistics) {
        this.salaryStatistics = salaryStatistics;
    }
}
