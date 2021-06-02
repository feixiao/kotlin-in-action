package ch08.ex1_2_2_CallingFunctionsPassedAsArguments1


//  扩展方式添加了filter方法
fun String.filter(predicate: (Char) -> Boolean): String {
    val sb = StringBuilder()
    for (index in 0 until length) {
        val element = get(index)
        if (predicate(element)) sb.append(element)  // 调用传入的函数
    }
    return sb.toString()
}

fun main(args: Array<String>) {
    println("ab1c".filter { it in 'a'..'z' })   // 传入函数为 判断字符是否在a..z
}
