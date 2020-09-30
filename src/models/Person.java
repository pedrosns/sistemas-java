package models;

public class Person {
    private String firstName;
    private String lastName;
    private String dni;


    public Person(String firsName, String lastName, String dni) {
        this.firstName = firsName;
        this.lastName = lastName;
        this.dni = dni;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }
    
    public String getDni() {
        return this.dni;
    }
}
