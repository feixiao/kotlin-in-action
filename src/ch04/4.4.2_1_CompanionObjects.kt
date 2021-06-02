package ch04.ex4_2_1_CompanionObjects

class A {
    // 使用companion定义内部类，容器类可以直接访问这个对象的方法和属性的能力
    // 不在指明对象的名称
    companion object {
        fun bar() {
            println("Companion object called")
        }
    }
}

fun main(args: Array<String>) {
    A.bar()
}
