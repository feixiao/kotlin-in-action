package ch05.ex2_1_5_FilterMap4

fun main(args: Array<String>) {
    val numbers = mapOf(0 to "zero", 1 to "one")


    // map对集合的每一个元素应用给定的函数并把结果返回给一个新的集合
    // filterKeys和mapKeys分别过滤和编号map的键 
    // filterValues和mapValues过滤和变换对应的值
    println(numbers.mapValues { it.value.toUpperCase() })

    // {0=ZERO, 1=ONE}
}
