package ch04.ex1_1_1_InterfacesInKotlin

// 声明一个接口
interface Clickable {
    fun click()
}

// 实现接口
class Button : Clickable {
    override fun click() = println("I was clicked")
}

fun main(args: Array<String>) {
    Button().click()
}
