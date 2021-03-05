package ch05.ex1_5_1_MemberReferences

fun salute() = println("Salute!")

fun main(args: Array<String>) {
    // ::为成员引用
    run(::salute)
}
