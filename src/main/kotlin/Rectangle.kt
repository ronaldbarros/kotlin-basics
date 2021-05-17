class Rectangle (val high:Int, val width:Int){

    val isSquare
    get() = high == width
}

fun main(){
    val rectangle:Rectangle = Rectangle(high = 10, width = 20)
    println(rectangle.isSquare)
}