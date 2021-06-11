package com.malcolmcrum.kotlindemo.javacomparison.b_nullability;

import com.malcolmcrum.kotlindemo.javacomparison.a_pojos.UserJava;

public class LowercaseLastNameJava {
    // Returns "Malcolm Crum" -> "crum"
    public static String getLowercaseLastName(UserJava user) {
        if (user != null) {
            if (user.getLastName() != null) {
                return user.getLastName().toLowerCase();
            }
        }
        return null;
    }
}
