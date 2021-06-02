package ch05.ex2_1_2_FilterMap1

data class Person(val name: String, val age: Int)

fun main(args: Array<String>) {
    val people = listOf(Person("Alice", 29), Person("Bob", 31))

    // filter 函数遍历集合并选出lamda表达式返回true的元
    println(people.filter { it.age > 30 })
    
    // [Person(name=Bob, age=31)]
}
