package ch08.ReturnWithLabel

data class Person(val name: String, val age: Int)

val people = listOf(Person("Alice", 29), Person("Bob", 31))

fun lookForAlice(people: List<Person>) {
    // 使用标签实现局部返回，局部返回跟for中的break类似，会终止lambda的执行
    // @ 符号标记一个标签从一个lambda返回
    people.forEach label@{
        if (it.name == "Alice") return@label    // 返回表达式标签？
    }
    println("Alice might be somewhere")
}

fun main(args: Array<String>) {
    lookForAlice(people)
}
