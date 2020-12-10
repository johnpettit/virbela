package com.xervanik.virbela.model;

public class User {
    private Integer id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;

    public User() {

    }

    public User(Integer newId, String newFirstName, String newLastName, String newEmail, String newPassword) {
        this.id = newId;
        this.firstName = newFirstName;
        this.lastName = newLastName;
        this.email = newEmail;
        this.password = newPassword;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
