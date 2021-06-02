package ch08.ex1_1_FunctionTypes

fun performRequest(
       url: String,
       callback: (code: Int, content: String) -> Unit   // 函数类型的参数现在有了名字
) {
    /*...*/
}

fun main(args: Array<String>) {
    val url = "http://kotl.in"
    performRequest(url) { code, content -> /*...*/ }    // 可以使用API中提供的参数名字作为lambda参数的名字
    performRequest(url) { code, page -> /*...*/ }               
}
