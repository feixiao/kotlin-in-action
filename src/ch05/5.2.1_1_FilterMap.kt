package ch05.ex2_1_1_FilterMap

fun main(args: Array<String>) {
    val list = listOf(1, 2, 3, 4)

    // filter 函数遍历集合并选出lamda表达式返回true的元素
    println(list.filter { it % 2 == 0 })
    // [2, 4]
}
