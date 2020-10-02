package models;

import java.time.LocalDate;

public class Person {
    private String firstName;
    private String lastName;
    private String dni;
    private LocalDate years;


    public Person(String firsName, String lastName, String dni,LocalDate years) {
        this.firstName = firsName;
        this.lastName = lastName;
        this.dni = dni;
        this.years= years;
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
    public LocalDate getYears(){
        return this.years;
    }


    //setters
    public void setYears( LocalDate years ){
        this.years=years;
    }
}
