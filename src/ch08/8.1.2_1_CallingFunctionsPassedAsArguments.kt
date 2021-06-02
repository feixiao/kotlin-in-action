package ch08.ex1_2_1_CallingFunctionsPassedAsArguments

fun twoAndThree(operation: (Int, Int) -> Int) {     // 定义一个函数类型的参数
    val result = operation(2, 3)        // 调用参数类型
    println("The result is $result")
}

fun main(args: Array<String>) {
    twoAndThree { a, b -> a + b }      // 函数调用都省去了()
    twoAndThree { a, b -> a * b }
}
