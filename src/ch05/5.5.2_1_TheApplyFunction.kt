package ch05.ex5_2_1_TheApplyFunction

// apply 结果会给接收对象
fun alphabet() = StringBuilder().apply {
    for (letter in 'A'..'Z') {
        append(letter)
    }
    append("\nNow I know the alphabet!")
}.toString()

fun main(args: Array<String>) {
    println(alphabet())
}
