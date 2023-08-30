package se.lexicon.TodoIT_assignment.model;

import se.lexicon.TodoIT_assignment.util.ValidatorsUtil;

import java.util.Objects;

public class Person {

    private int id;

    private String firstName;

    private String lastName;

    private String email;

    private AppUser credentials;


    // Constructor


    public Person(int id, String firstName, String lastName, String email, AppUser credentials) {
        ValidatorsUtil.validateStringNotEmpty(firstName);
        ValidatorsUtil.validateStringNotEmpty(lastName);
        ValidatorsUtil.validateStringNotEmpty(email);
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.credentials = credentials;
    }

    public Person(int id, String firstName, String lastName, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // Checks if the two objects refer to the same memory location
        if (!(o instanceof Person person)) return false; //If not checks if object is an instance of the class Person
        return id == person.id && Objects.equals(firstName, person.firstName) && Objects.equals(lastName, person.lastName) && Objects.equals(email, person.email);
    } // Above method is a compact version of the commented method below.

//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) {
//            return true;
//        }
//        if (obj == null || this.getClass() != obj.getClass()) {
//            return false;
//        }
//        Person person = (Person) obj;
//        return (this.id == person.getId()) &&
//                Objects.equals(this.firstName, person.getFirstName()) &&
//                Objects.equals(this.lastName, person.getLastName()) &&
//                Objects.equals(this.email, person.getEmail());
//    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, email);
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

// Methods
    public String getSummary() {
        return String.format("{id: %s, firstName: %s, lastName: %s, email: %s}", id, firstName, lastName, email);
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        ValidatorsUtil.validateStringNotEmpty(firstName);
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        ValidatorsUtil.validateStringNotEmpty(lastName);
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        ValidatorsUtil.validateStringNotEmpty(email);
        this.email = email;
    }
}
