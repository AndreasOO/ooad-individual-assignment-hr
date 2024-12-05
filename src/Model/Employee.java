package Model;

public class Employee implements Comparable<Employee>{
    private static int nextEmployeeId = 1;
    private long id;
    private String name;
    private Position position;
    private String email;
    private double salary;
    private int workingPercentage;
    private String phoneNumber;




    public Employee(String name, int workingPercentage, Position position, String email, double salary,  String phoneNumber) {
        this.id = nextEmployeeId++;
        this.name = name;
        this.workingPercentage = workingPercentage;
        this.position = position;
        this.email = email;
        this.salary = salary;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

