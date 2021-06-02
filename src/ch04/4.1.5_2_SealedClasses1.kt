package ch04.ex1_5_2_SealedClasses1

// 将基类标记为密封，将所有可能的类作为嵌套类累成
sealed class Expr {
    class Num(val value: Int) : Expr()
    class Sum(val left: Expr, val right: Expr) : Expr()
}

fun eval(e: Expr): Int =
    when (e) {      // when 包含了所有的情况所以不需要else分支
        is Expr.Num -> e.value
        is Expr.Sum -> eval(e.right) + eval(e.left)
    }

fun main(args: Array<String>) {
    println(eval(Expr.Sum(Expr.Sum(Expr.Num(1), Expr.Num(2)), Expr.Num(4))))
}
