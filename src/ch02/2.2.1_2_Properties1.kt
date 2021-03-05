package ch02.person

class Person(
    val name: String,           // val 常量
    var isMarried: Boolean      // var 变量
)

fun main(args: Array<String>) {
    val person = Person("Bob", true)
    println(person.name)
    println(person.isMarried)
}
