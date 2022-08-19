package model;

import java.time.LocalDate;

public class Person {
    // These things are called fields
    private String firstName;
    private String lastName;
    private LocalDate dob;
    private Address address;

    // No arg constructor... some frameworks require one
    private Person() {

    }

    // Allowing methods to be passed in
    public Person(String firstName, String lastName, LocalDate dob) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
    }

    public String getFirstName() {
        return firstName.substring(0, 1).toUpperCase() + firstName.substring(1);
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


}
