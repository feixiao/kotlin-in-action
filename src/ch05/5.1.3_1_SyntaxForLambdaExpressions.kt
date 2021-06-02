package ch05.ex1_3_1_SyntaxForLambdaExpressions

fun main(args: Array<String>) {

    // lamda表达式始终使用{}包围
    val sum = { x: Int, y: Int -> x + y }
    println(sum(1, 2))
}
