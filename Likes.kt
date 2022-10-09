fun main() {
    val likes = 201
    val person = "человеку"
    val people = "людям"

    val res = if (likes % 100 == 11) people else if (likes % 10 == 1) person else people
    println("Понравилось: " + likes + " " + res)
}
