fun main() {
    val likes: Int = 60

    val result = if (likes % 10 == 1) "человеку" else "людям"

    println("Понравилось $likes $result")
}