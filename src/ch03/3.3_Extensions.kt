package strings

// 扩展类功能
// 接收者对象的this可以省掉
//  fun String.lastChar(): Char = get(length - 1)
fun String.lastChar(): Char = this.get(this.length - 1)

fun main(args: Array<String>) {
    println("Kotlin".lastChar())
}
