public abstract class EmployeeS {
    //Write a Java program that creates a class hierarchy for employees of a company.
    // The base class should be Employee, with subclasses Manager, Developer, and Programmer.
    // Each subclass should have properties such as name, address, salary, and job title.
    // Implement methods for calculating bonuses, generating performance reports, and managing projects.

    private String name;
    private double salary;
    private String address;
    private String title;

    public EmployeeS(String name, double salary, String address, String title){
        this.name = name;
        this.salary = salary;
        this.address = address;
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String getAddress() {
        return address;
    }

    public String getTitle() {
        return title;
    }

    public abstract double Bonuses();

    public abstract String PerformanceReport();

    public  abstract String Projects();
}
