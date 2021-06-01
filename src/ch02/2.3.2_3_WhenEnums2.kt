package ch02.ex3_2_3_WhenEnums2

import ch02.colors.Color
import ch02.colors.Color.*  // 全部导入

fun getWarmth(color: Color) = when(color) {
    // 因为上面全部导入，现在不需要使用限定词，但是应该不是推荐的方式
    RED, ORANGE, YELLOW -> "warm"
    GREEN -> "neutral"
    BLUE, INDIGO, VIOLET -> "cold"
}

fun main(args: Array<String>) {
    println(getWarmth(Color.ORANGE))
}
