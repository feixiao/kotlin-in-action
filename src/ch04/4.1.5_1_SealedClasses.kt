package ch04.ex1_5_1_SealedClasses

// 作为接口实现的表达式
interface Expr
class Num(val value: Int) : Expr
class Sum(val left: Expr, val right: Expr) : Expr

fun eval(e: Expr): Int =
    when (e) {
        is Num -> e.value
        is Sum -> eval(e.right) + eval(e.left)
        else ->
            throw IllegalArgumentException("Unknown expression")    // 必须添加一个默认分支很不方便, 通过下面的密封类解决问题
    }

fun main(args: Array<String>) {
    println(eval(Sum(Sum(Num(1), Num(2)), Num(4))))
}
