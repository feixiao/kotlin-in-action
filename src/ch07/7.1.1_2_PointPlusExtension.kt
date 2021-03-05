package ch07.PointPlusExtension

data class Point(val x: Int, val y: Int)

// 扩展方式进行运算符重载
operator fun Point.plus(other: Point): Point {
    return Point(x + other.x, y + other.y)
}

fun main(args: Array<String>) {
    val p1 = Point(10, 20)
    val p2 = Point(30, 40)
    println(p1 + p2)
}
