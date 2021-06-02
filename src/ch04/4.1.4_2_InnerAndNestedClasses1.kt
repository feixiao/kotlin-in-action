package ch04.ex1_4_2_InnerAndNestedClasses1

class Outer {
    // 嵌套类不持有外部类的引用，而内部类持有
    inner class Inner {
        fun getOuterReference(): Outer = this@Outer // 访问Outer类
    }
}
