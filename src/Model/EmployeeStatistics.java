package Model;

import java.util.IntSummaryStatistics;
import java.util.Map;

public class EmployeeStatistics {
    private int numberOfEmployees;
    private double averageWorkingPercentage;
    private Map<Position, Double> positionPercentages;
    private IntSummaryStatistics salaryStatistics;
    public EmployeeStatistics() {};

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    public double getAverageWorkingPercentage() {
        return averageWorkingPercentage;
    }

    public void setAverageWorkingPercentage(double averageWorkingPercentage) {
        this.averageWorkingPercentage = averageWorkingPercentage;
    }

    public Map<Position, Double> getPositionPercentages() {
        return positionPercentages;
    }

    public void setPositionPercentages(Map<Position, Double> positionPercentages) {
        this.positionPercentages = positionPercentages;
    }

    public IntSummaryStatistics getSalaryStatistics() {
        return salaryStatistics;
    }

    public void setSalaryStatistics(IntSummaryStatistics salaryStatistics) {
        this.salaryStatistics = salaryStatistics;
    }
}
