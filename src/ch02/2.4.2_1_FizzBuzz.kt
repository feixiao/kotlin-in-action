package ch02.FizzBuzz

fun fizzBuzz(i: Int) = when {
    i % 15 == 0 -> "FizzBuzz "
    i % 3 == 0 -> "Fizz "
    i % 5 == 0 -> "Buzz "
    else -> "$i "
}

fun main(args: Array<String>) {
    // 在整数区间1..100中间迭代
    for (i in 1..100) {
        print(fizzBuzz(i))
    }
}
