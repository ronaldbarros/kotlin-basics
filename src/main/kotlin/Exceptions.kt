import java.lang.IllegalArgumentException

fun percentage(number: Int): String {
    return if(number in 1..100){
        "$number%"
    }else{
        throw IllegalArgumentException("The number must be between 1 and 100")
    }
}

fun main() {
    try {
        val percentage = percentage(51)
        println(percentage)
    } catch (e: IllegalArgumentException){
        println(e.message)
    }
}