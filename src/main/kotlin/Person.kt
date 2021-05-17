class Person (
    val name:String,
    val age:Int
)

fun main(){
    val person1:Person = Person(name = "Rony", age = 42)
    val person2:Person = Person(name = "Theo", age = 0)

    println("Person 1: ${person1.name}, ${person1.age} years")
    println("Person 2: ${person2.name}, ${person2.age} years")
}