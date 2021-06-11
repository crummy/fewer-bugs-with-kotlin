package com.malcolmcrum.kotlindemo.javacomparison.b_nullability

import com.malcolmcrum.kotlindemo.javacomparison.a_pojos.User

fun lowercaseLastName(user: User?): String? {
    return user?.lastName?.toLowerCase()
}