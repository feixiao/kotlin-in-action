package ch08.ex3_3_AnonymousFunctions

data class Person(val name: String, val age: Int)

val people = listOf(Person("Alice", 29), Person("Bob", 31))

fun lookForAlice(people: List<Person>) {
    people.forEach(fun (person) {                   // 使用匿名函数取代lambda表达式
        if (person.name == "Alice") return          // return 指向最近的函数，一个匿名函数
        println("${person.name} is not Alice")
    })
}

fun main(args: Array<String>) {
    lookForAlice(people)
}
