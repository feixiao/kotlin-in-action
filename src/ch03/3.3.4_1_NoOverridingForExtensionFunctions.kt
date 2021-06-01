package ch03.ex3_4_1_NoOverridingForExtensionFunctions

open class View {
    open fun click() = println("View clicked")
}

class Button: View() {
    // 重写扩展函数很常见，但是不能重写扩展函数
    override fun click() = println("Button clicked")
}

fun main(args: Array<String>) {
    val view: View = Button()
    view.click()
    // 输出为"Button clicked"
}
