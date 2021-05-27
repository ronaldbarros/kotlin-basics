fun main(){
    var temperature:Int
    var sum:Int = 0
    var amount:Int = 0

    do{
        println("Enter number of degrees or type 999 to exit:")
        temperature = readLine()!!.toInt()

        if (temperature != 999){
            sum += temperature
            amount++
        }
    }while(temperature != 999)

        println("Average temperature = ${sum/amount}")
}