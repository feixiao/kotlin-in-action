package ch02.ex4_3_IteratingOverMaps

import java.util.TreeMap

fun main(args: Array<String>) {

    // 创建map
    val binaryReps = TreeMap<Char, String>()
    for (c in 'A'..'F') {
        // ASCII码转换为二进制
        val binary = Integer.toBinaryString(c.toInt())
        binaryReps[c] = binary
    }


    // 迭代map
    for ((letter, binary) in binaryReps) {
        println("$letter = $binary")
    }
}
