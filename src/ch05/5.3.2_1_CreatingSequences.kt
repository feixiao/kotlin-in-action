package ch05.ex3_2_1_CreatingSequences

fun main(args: Array<String>) {

    // 创建序列
    val naturalNumbers = generateSequence(0) { it + 1 }
    println(naturalNumbers)
    val numbersTo100 = naturalNumbers.takeWhile { it <= 100 }
    println(numbersTo100.sum()) //  获取sum
}
