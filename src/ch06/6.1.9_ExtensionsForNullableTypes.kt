package ch06.ex1_9_ExtensionsForNullableTypes

fun verifyUserInput(input: String?) {
    // isNullOrBlank会显示检测null
    if (input.isNullOrBlank()) {
        println("Please fill in the required fields")
    }
}

fun main(args: Array<String>) {
    verifyUserInput(" ")
    verifyUserInput(null)
}
