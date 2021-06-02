package ch08.ex3_2_3_ReturningFromLambdas2


fun main(args: Array<String>) {

    // 带this标签的表达式
    println(StringBuilder().apply sb@{      // 通过this@sb访问
       listOf(1, 2, 3).apply {              // this指向作用域内最近的隐式接收者
           this@sb.append(this.toString())  
       }
    })
}
