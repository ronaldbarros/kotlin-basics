fun main(){
    val name:String = "Rony"
    println("Hello, $name!")
    println("Hello, \$name!") //a barra \ antes do $ anula a string

    println("The sum result is ${sum(a = 10, b = 20)}")
}

fun sum(a: Int, b: Int): Int{
    return a + b
}