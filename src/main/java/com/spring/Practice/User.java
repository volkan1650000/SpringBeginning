package com.spring.Practice;

import java.util.HashMap;
import java.util.Map;

public class User {
    static int idDeclaration = 1;
    public static final Map<Integer, User> users = new HashMap<>();

    private final int id;

    private String firstName;
    private String lastName;
    private String password;

    public User() {
        this.id = idDeclaration;
        users.put(id, this);
        idDeclaration++;
    }

    public int getId() {
        return id;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
