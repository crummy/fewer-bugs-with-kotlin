package com.malcolmcrum.kotlindemo.javacomparison

@JvmInline
value class Distance(private val millimeters: Long) {
    override fun toString(): String {
        return when {
            millimeters < 1000 -> "$millimeters mm"
            millimeters < 1000_000 -> "${millimeters.toFloat() / 1000} m"
            millimeters < 1000_000_000 -> "${millimeters.toFloat() / 1000_000} km"
            else -> "An extremely long distance!"
        }
    }

    companion object {
        fun ofMeters(meters: Long): Distance = Distance(meters * 1000)
        fun ofKilometers(kilometers: Long): Distance = Distance(kilometers * 1000 * 1000)
    }
}

fun Number.toMeters() = Distance.ofMeters(this.toLong())

fun main() {
    println(1.toMeters())
    println(999999.toMeters())
}