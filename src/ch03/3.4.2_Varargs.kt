package ch03.ex4_2_Varargs

fun main(args: Array<String>) {
    val list = listOf("args: ", *args)  // Kotlin要求显示地解包数组, 展开运算符
    println(list)
}
