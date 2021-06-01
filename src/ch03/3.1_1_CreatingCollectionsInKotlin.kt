package ch03.ex1_1_CreatingCollectionsInKotlin

//创建set
val set = hashSetOf(1, 7, 53)
// 创建list
val list = arrayListOf(1, 7, 53)
// 创建map
val map = hashMapOf(1 to "one", 7 to "seven", 53 to "fifty-three")

fun main(args: Array<String>) {
    // 输出实现的java类
    println(set.javaClass)
    println(list.javaClass)
    println(map.javaClass)
}
