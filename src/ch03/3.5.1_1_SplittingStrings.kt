package ch03.ex5_1_1_SplittingStrings

fun main(args: Array<String>) {
    println("12.345-6.A".split("\\.|-".toRegex()))  // 创建正则表达式
}
