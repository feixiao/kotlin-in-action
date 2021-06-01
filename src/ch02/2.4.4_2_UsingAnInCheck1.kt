package ch02.ex4_4_2_UsingAnInCheck1

// 用in作为when的分支
fun recognize(c: Char) = when (c) {
    in '0'..'9' -> "It's a digit!"
    in 'a'..'z', in 'A'..'Z' -> "It's a letter!"
    else -> "I don't know…​"
}

fun main(args: Array<String>) {
    println(recognize('8'))
}
