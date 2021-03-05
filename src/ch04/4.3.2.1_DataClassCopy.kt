package ch04.ex3_2_1_DataClassCopy

data class Client(val name: String, val postalCode: Int)

fun main(args: Array<String>) {
    val bob = Client("Bob", 973293)
    // 为了让使用不可变的对象的数据类变得容易,kotlin编译器为他们生成一个copy方法
    // 应许拷贝的时候修改某些属性的值
    println(bob.copy(postalCode = 382555))
}
