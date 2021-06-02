package ch05.ex2_1_4_FilterMap3

data class Person(val name: String, val age: Int)

fun main(args: Array<String>) {
    val people = listOf(Person("Alice", 29), Person("Bob", 31))

     // map对集合的每一个元素应用给定的函数并把结果返回给一个新的集合
    println(people.map { it.name })

    // [Alice, Bob]
}
