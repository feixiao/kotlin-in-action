package ch04.main

class Button : Clickable, Focusable {
    override fun click() = println("I was clicked")

    override fun showOff() {
        // 集成成员有不止一个的实现，必须显示实现
        super<Clickable>.showOff()
        super<Focusable>.showOff()
    }
}

interface Clickable {
    fun click()
    fun showOff() = println("I'm clickable!")       // 带默认实现的方法
}

interface Focusable {
    fun setFocus(b: Boolean) =
        println("I ${if (b) "got" else "lost"} focus.")

    fun showOff() = println("I'm focusable!")
}

fun main(args: Array<String>) {
    val button = Button()
    button.showOff()
    button.setFocus(true)
    button.click()
}
