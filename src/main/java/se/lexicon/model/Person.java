package se.lexicon.model;

import static se.lexicon.util.ValidatorsUtil.validateStringNotEmpty;

public class Person {

    private int id;

    private String firstName;

    private String lastName;

    private String email;

    // Constructor
    public Person(int id, String firstName, String lastName, String email) {
        validateStringNotEmpty(firstName);
        validateStringNotEmpty(lastName);
        validateStringNotEmpty(email);
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
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
        validateStringNotEmpty(firstName);
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        validateStringNotEmpty(lastName);
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        validateStringNotEmpty(email);
        this.email = email;
    }
}
