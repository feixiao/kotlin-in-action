package ch03.ex3_4_1_NoOverridingForExtensionFunctions

open class View {
    open fun click() = println("View clicked")
}


// 继承View
class Button: View() {
    // 重写扩展函数很常见，但是不能重写扩展函数
    override fun click() = println("Button clicked")
}

fun main(args: Array<String>) {
    val view: View = Button()
    view.click() // 具体调用哪个方法，由实际的View的值来决定
    // 输出为"Button clicked"
}
