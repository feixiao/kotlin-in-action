package ch02.ex1_4_3_StringTemplates2

fun main(args: Array<String>) {

    // ${} 内部嵌入表达式
    println("Hello, ${if (args.size > 0) args[0] else "someone"}!")
}
