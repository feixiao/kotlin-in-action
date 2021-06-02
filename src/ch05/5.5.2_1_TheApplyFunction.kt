package ch05.ex5_2_1_TheApplyFunction

// apply和with函数一模一样，会返回作为实参传递给他的对象
fun alphabet() = StringBuilder().apply {
    for (letter in 'A'..'Z') {
        append(letter)
    }
    append("\nNow I know the alphabet!")
}.toString()

fun main(args: Array<String>) {
    println(alphabet())
}
