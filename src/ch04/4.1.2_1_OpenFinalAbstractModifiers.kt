package ch04.ex1_2_1_OpenFinalAbstractModifiers

interface Clickable {
    fun click()
    fun showOff() = println("I'm clickable!")
}

open class RichButton : Clickable {

    fun disable() {}                // final函数，子类中不能重写

    open fun animate() {}           // open函数，子类可以重写

    override fun click() {}         // open函数本身同样是open的
}
