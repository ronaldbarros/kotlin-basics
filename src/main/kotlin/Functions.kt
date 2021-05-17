fun main(){
    println(max(a = 10, b = 5))
    println(max1(a = 15, b = 30))
}

//Corpo de bloco
fun max(a: Int, b: Int): Int {
    return if (a > b) a else b
}

//Corpo de expressão
fun max1(a: Int, b: Int) = if (a > b) a else b