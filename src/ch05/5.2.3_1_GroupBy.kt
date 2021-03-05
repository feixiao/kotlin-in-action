package ch05.ex2_3_1_GroupBy

data class Person(val name: String, val age: Int)

fun main(args: Array<String>) {
    val people = listOf(Person("Alice", 31),
            Person("Bob", 29), Person("Carol", 31))

    // 根据年纪分组       
    println(people.groupBy { it.age })

    // 31=[Person(name=Alice, age=31), Person(name=Carol, age=31)], 29=[Person(name=Bob, age=29)]}
}
