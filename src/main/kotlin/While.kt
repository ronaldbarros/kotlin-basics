fun main (){
    var temperature = 0
    var sum = 0
    var amount = 0

    while(temperature != 999){
        println("Enter number of degrees or type 999 to exit")
        temperature = readLine()!!.toInt()

        if(temperature != 999){
            sum += temperature
            amount++
        }

    }
    println("Average temperature = ${sum/amount}")
}