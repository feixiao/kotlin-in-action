package ch08.ex1_5_1_ReturningFunctionsFromFunctions

enum class Delivery { STANDARD, EXPEDITED }

class Order(val itemCount: Int)

fun getShippingCostCalculator(
        delivery: Delivery): (Order) -> Double {            // 声明一个返回函数的函数
    if (delivery == Delivery.EXPEDITED) {
        return { order -> 6 + 2.1 * order.itemCount }
    }

    return { order -> 1.2 * order.itemCount }
}

fun main(args: Array<String>) {
    val calculator =
        getShippingCostCalculator(Delivery.EXPEDITED)      // 将返回的函数保存在变量中
    println("Shipping costs ${calculator(Order(3))}")      // 调用返回的函数
}
