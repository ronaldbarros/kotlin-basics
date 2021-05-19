import java.lang.IllegalArgumentException

interface Expression
class Number(val value: Int): Expression
class Sum(val left: Expression, val right: Expression): Expression

fun evaluation(expression: Expression): Int{
    if (expression is Number){
        return expression.value
    }

    if (expression is Sum){
        return evaluation(expression.left) + evaluation(expression.right)
    }

    throw IllegalArgumentException("Unknown expression")
}

fun main(){
    //((1 + 2) + 4 = 7
    val result = evaluation(Sum(Sum(Number(value = 1), Number(value = 2)), Number(value = 4)))
    println(result)
}