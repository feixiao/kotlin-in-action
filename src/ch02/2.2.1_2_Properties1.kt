package ch02.person

// 定义类和属性
class Person(
    val name: String,           // val 常量
    var isMarried: Boolean      // var 变量
)

fun main(args: Array<String>) {
    // 创建类
    val person = Person("Bob", true)
    
    println(person.name)
    println(person.isMarried)
}
