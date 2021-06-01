package ch02.ex1_2_Functions

// 函数定义
fun max(a: Int, b: Int): Int {
    return if (a > b) a else b
}

fun main(args: Array<String>) {
    // 函数调用
    println(max(1, 2))
}
