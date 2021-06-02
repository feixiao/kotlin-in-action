package ch03.ex3_5_ExtensionProperties

// 扩展属性
val String.lastChar: Char
    get() = get(length - 1)


// 扩展属性
var StringBuilder.lastChar: Char
    get() = get(length - 1)                     // getter属性
    set(value: Char) {
        this.setCharAt(length - 1, value)       // setter属性
    }

fun main(args: Array<String>) {
    println("Kotlin".lastChar)
    val sb = StringBuilder("Kotlin?")
    sb.lastChar = '!'
    println(sb)
}
