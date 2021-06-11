package com.malcolmcrum.kotlindemo.javacomparison.c_when

import com.malcolmcrum.kotlindemo.javacomparison.a_pojos.User

// Spot the bug!
fun getInitialedName(user: User?): String? {
    return when {
        user == null -> "Nameless"
//        user.lastName != null -> user.firstName.uppercase() + " " + user.lastName.uppercase() + "."
        else -> user.firstName?.uppercase()
    }
}