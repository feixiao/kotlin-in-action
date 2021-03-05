package ch04.ex2_5_ChangingAccessorVisibility

class LengthCounter {
    var counter: Int = 0
        private set // set 被私有化了, 外面不能赋值

    fun addWord(word: String) {
        counter += word.length
    }
}

fun main(args: Array<String>) {
    val lengthCounter = LengthCounter()
    lengthCounter.addWord("Hi!")
    // lengthCounter.counter = 1   // Cannot assign to 'counter': the setter is private in 'LengthCounter'
    println(lengthCounter.counter)
}
