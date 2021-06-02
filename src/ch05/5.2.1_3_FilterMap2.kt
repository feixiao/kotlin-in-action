package ch05.ex2_1_3_FilterMap2

fun main(args: Array<String>) {
    val list = listOf(1, 2, 3, 4)

    // map对集合的每一个元素应用给定的函数并把结果返回给一个新的集合
    println(list.map { it * it })
    // [1, 4, 9, 16]
}
