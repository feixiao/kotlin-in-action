package ch05.ex2_3_2_GroupBy1

fun main(args: Array<String>) {
    val list = listOf("a", "ab", "b")

    // 根据第一个字符分组？
    println(list.groupBy(String::first))


    // {a=[a, ab], b=[b]}
}
