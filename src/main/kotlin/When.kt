fun colorTemperature (color: Color): String {
    return when(color){
        Color.RED,Color.YELLOW, Color.ORANGE -> "Warm color"
        Color.BLUE,Color.GREEN -> "Cool color"
        Color.PURPLE -> "Hot & cool color"
    }
}

fun colorWheel (color: Color): String{
    return when(color){
        Color.RED -> "Opposite color: green"
        Color.GREEN -> "Opposite color: red"
        Color.BLUE -> "Opposite color: orange"
        Color.ORANGE -> "Opposite color: blue"
        Color.YELLOW -> "Opposite color: purple"
        Color.PURPLE -> "Opposite color: yellow"
    }
}

fun main(){
    val temperature = colorTemperature(Color.GREEN)
    println(temperature)

    val opposite = colorWheel(Color.GREEN)
    println(opposite)
}