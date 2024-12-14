package Model;

public class Employee implements Comparable<Employee>{
    private static long nextEmployeeId = 1;
    private final long id;
    private final String name;
    private final Position position;
    private final String email;
    private final double salary;
    private final int workingPercentage;
    private final String phoneNumber;




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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o instanceof Employee employee) {
            return this.id == employee.id;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Long.hashCode(id);
    }

    public long getId() {
        return id;
    }


    public String getName() {
        return name;
    }


    public Position getPosition() {
        return position;
    }


    public String getEmail() {
        return email;
    }


    public double getSalary() {
        return salary;
    }


    public int getWorkingPercentage() {
        return workingPercentage;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

}

