package com.malcolmcrum.kotlindemo.javacomparison.c_when;

import com.malcolmcrum.kotlindemo.javacomparison.a_pojos.UserJava;

public class InitialedNameJava {
    // Returns "Malcolm Crum" -> "MALCOLM C."
    public static String getInitialedName(UserJava user) {
        if (user != null) {
            if (user.getLastName() != null) {
                return user.getFirstName().toUpperCase() + " " + user.getLastName().toUpperCase().charAt(0) + ".";
            } else {
                return user.getFirstName();
            }
        } else {
            return "Unknown";
        }
    }
}
