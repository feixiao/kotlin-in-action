package ch06.ex1_7_TheLetFunction

fun sendEmailTo(email: String) {
    println("Sending email to $email")
}

fun main(args: Array<String>) {
    var email: String? = "yole@example.com"
    // let 对表达式结果
    email?.let { sendEmailTo(it) }
    email = null
    email?.let { sendEmailTo(it) }

    // Sending email to yole@example.com
}
