package Model;

public class Employee implements Comparable<Employee>{
    private static int nextEmployeeId = 1;
    private long id;
    private String name;
    private Position position;
    private double salary;
    private int workingPercentage;
    private String phoneNumber;




    public Employee(String name, Position position, double salary, int workingPercentage, String phoneNumber) {
        this.id = nextEmployeeId++;
        this.name = name;
        this.position = position;
        this.salary = salary;
        this.workingPercentage = workingPercentage;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public int compareTo(Employee o) {
        return (int) (this.id - o.getId());
    }

    public static int getNextEmployeeId() {
        return nextEmployeeId;
    }

    public static void setNextEmployeeId(int nextEmployeeId) {
        Employee.nextEmployeeId = nextEmployeeId;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getWorkingPercentage() {
        return workingPercentage;
    }

    public void setWorkingPercentage(int workingPercentage) {
        this.workingPercentage = workingPercentage;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}

