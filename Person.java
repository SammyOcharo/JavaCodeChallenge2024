public class Person {
    //Write a Java program to create a class known as Person with methods called getFirstName() and getLastName().
    // Create a subclass called Employee that adds a new method named getEmployeeId() and overrides the getLastName() method to include the employee's job title.

    private String FirstName;
    private String SecondName;

    public Person(String FirstName, String SecondName){
        this.FirstName = FirstName;
        this.SecondName = SecondName;

    }

    public String getFirstName(){

        return  FirstName;
    }

    public String getSecondName(){

        return SecondName;
    }
}
