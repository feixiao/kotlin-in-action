package ch04.ex3_1_2_2_ObjectEqualityEquals1

class Client(val name: String, val postalCode: Int) {
    // 缺少hashCode方法,违反了通用hasCode契约, 如果两个对象相同必须含有相同的hash值
    // hashCode会自动生成
    // data 关键字都解决了，所以这边的equals没有什么意义
    override fun equals(other: Any?): Boolean {
        if (other == null || other !is Client)
            return false
        return name == other.name &&
               postalCode == other.postalCode
    }
    override fun toString() = "Client(name=$name, postalCode=$postalCode)"
}

fun main(args: Array<String>) {
    val processed = hashSetOf(Client("Alice", 342562))
    val c Client("Alice", 342562)

    println(c)

    println(processed.contains(Client("Alice", 342562)))
}
