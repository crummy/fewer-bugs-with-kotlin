import com.malcolmcrum.kotlindemo.javacomparison.a_pojos.User

val results = listOf("green", "red", "yellow", "green", "green", "cow")
    .filter { word -> word != "cow"}
    .groupBy { colour -> colour.length }
    .map { (letterCount, colours) -> "Colours with $letterCount letters: $colours" }
    .shuffled()
    .last()


fun `smart cast`() {
    var foo: Any? = null
    if (foo != null) {
        println(foo.toString())
    }
    if (foo is Float) {
        foo = foo + 2
    }
}

fun `data classes`() {
    val user = User("crummy", "Malcolm", "Crum")
    val duplicate = user.copy(username = "crummy2")
}

fun `string interpolation`() {
    val language = "kotlin";
    println("$language? ${language.uppercase()}!")
}