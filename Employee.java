public class Employee extends Person{
    //Write a Java program to create a class known as Person with methods called getFirstName() and getLastName().
    // Create a subclass called Employee that adds a new method named getEmployeeId() and overrides the getLastName() method to include the employee's job title.

    private int EmployeeId;
    private String EmployeeTitle;

    public Employee(int EmployeeId, String EmployeeTitle, String FirstName, String SecondName){
        super(FirstName, SecondName);
        this.EmployeeId = EmployeeId;
        this.EmployeeTitle = EmployeeTitle;

    }

    public int getEmployeeId(){
        return EmployeeId;
    }

    @Override
    public String getSecondName() {
        return super.getSecondName() + " " + EmployeeTitle;
    }

    public static void main(String[] args) {
        Person person = new Person("Sammy", "Ocharo");

        System.out.println("The Person's name is "+ person.getFirstName() + " " + person.getSecondName());

        Employee employee = new Employee(1, "Engineer", "Sammy", "Ocharo");

        System.out.println("The Person's id is " + employee.getEmployeeId() + " and name is "+ employee.getFirstName() + " " + employee.getSecondName());
    }
}
