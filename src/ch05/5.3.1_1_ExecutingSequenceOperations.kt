package ch05.ex3_1_1_ExecutingSequenceOperations

fun main(args: Array<String>) {
    var list = listOf(1, 2, 3, 4).asSequence()         // 为了效率把初始集合转换成序列
            .map { print("map($it) "); it * it }
            .filter { print("filter($it) "); it % 2 == 0 }
            .toList()

    println(list)        
}
