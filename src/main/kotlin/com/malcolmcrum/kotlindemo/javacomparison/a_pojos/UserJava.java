package com.malcolmcrum.kotlindemo.javacomparison.a_pojos;

import java.util.Objects;

public class UserJava {
    private final String username;
    private final String firstName;
    private final String lastName;

    public UserJava(String username, String firstName, String lastName) {
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getUsername() {
        return username;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserJava userJava = (UserJava) o;
        return Objects.equals(username, userJava.username) &&
                Objects.equals(firstName, userJava.firstName) &&
                Objects.equals(lastName, userJava.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, firstName, lastName);
    }
}
