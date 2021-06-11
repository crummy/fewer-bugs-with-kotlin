import com.malcolmcrum.kotlindemo.javacomparison.a_pojos.User

fun main() {
    val user = User("username", "firstname", "lastname")

    val (username, firstname, lastname) = User("username", "firstname", "lastname")

    val (year, month, day) = "\\d\\d\\d\\d-\\d\\d-\\d\\d".toRegex()
        .matchEntire("1986-05-07")
        ?.destructured ?: throw Error("No match found")
}
