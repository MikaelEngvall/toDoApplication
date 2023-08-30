package se.lexicon.TodoIT_assignment.model;

import se.lexicon.TodoIT_assignment.util.ValidatorsUtil;

import java.util.Objects;

public class AppUser {
    private String username;
    private String password;
    private AppRole role;


    // Methods

    // Constructors

    public AppUser(String username, String password, AppRole role) {
        ValidatorsUtil.validateStringNotEmpty(username);
        ValidatorsUtil.validateStringNotEmpty(password);
        this.username = username;
//        this.password = password;
        this.role = role;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AppUser appUser)) return false;
        return Objects.equals(getUsername(), appUser.getUsername()) && Objects.equals(getPassword(), appUser.getPassword()) && getRole() == appUser.getRole();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUsername(), getPassword(), getRole());
    }

    @Override
    public String toString() {
        return "AppUser{" +
                "username='" + username + '\'' +
                ", role=" + role +
                '}';
    }
    // Getters and Setters

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

//    public void setPassword(String password) {
//        this.password = password;
//    }

    public AppRole getRole() {
        return role;
    }

    public void setRole(AppRole role) {
        this.role = role;
    }
}
