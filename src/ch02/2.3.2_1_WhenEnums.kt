package ch02.ex3_2_1_WhenEnums

// 枚举类
enum class Color {
    RED, ORANGE, YELLOW, GREEN, BLUE, INDIGO, VIOLET
}

// 函数省略了返回类型，有点恶心...
fun getMnemonic(color: Color) =     // 直接返回一个when的表达式
    when (color) {
        // 类型跟枚举变量相同就返回对应的颜色
        Color.RED -> "Richard"
        Color.ORANGE -> "Of"
        Color.YELLOW -> "York"
        Color.GREEN -> "Gave"
        Color.BLUE -> "Battle"
        Color.INDIGO -> "In"
        Color.VIOLET -> "Vain"
    }

fun main(args: Array<String>) {
    println(getMnemonic(Color.BLUE))
}
