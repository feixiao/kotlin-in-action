package ch05.ex2_4_1_FlatMapFlatten

fun main(args: Array<String>) {
    val strings = listOf("abc", "def")

    // flatMap做两件事情：
    //  根据实参给定的函数对集合的每个元素进行变换,然后把多个列表合并为一个列表
    // 转为list
    println(strings.flatMap { it.toList() })

    // [a, b, c, d, e, f]
}
