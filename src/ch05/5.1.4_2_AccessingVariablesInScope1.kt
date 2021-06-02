package ch05.ex1_4_2_AccessingVariablesInScope1

fun printProblemCounts(responses: Collection<String>) { 
    // 声明在lamda内部访问的变量
    var clientErrors = 0
    var serverErrors = 0
    responses.forEach {
        if (it.startsWith("4")) {
            clientErrors++                  // lamda表达式中修改变量
        } else if (it.startsWith("5")) {
            serverErrors++
        }
    }
    println("$clientErrors client errors, $serverErrors server errors")
}

fun main(args: Array<String>) {
    val responses = listOf("200 OK", "418 I'm a teapot",
                           "500 Internal Server Error")
    printProblemCounts(responses)
}
