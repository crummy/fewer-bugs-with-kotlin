package com.malcolmcrum.kotlindemo.javacomparison.d_delegates

class LoggingList<T>(private val inner: MutableList<T>) : MutableList<T> by inner {
    override fun add(element: T): Boolean {
        println("Adding element to list. Size: $size")
        return inner.add(element)
    }

    override fun remove(element: T): Boolean {
        println("Removing element from list. Size: $size")
        return inner.remove(element)
    }
}