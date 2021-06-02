package ch04.ex2_3_1_ImplementingPropertiesDeclaredInInterfaces

fun getFacebookName(accountId: Int) = "fb:$accountId"

interface User {
    val nickname: String
}

// 实现接口属性
class PrivateUser(override val nickname: String) : User

class SubscribingUser(val email: String) : User {
    override val nickname: String
        get() = email.substringBefore('@')      // 自定义geter
}

class FacebookUser(val accountId: Int) : User {
    override val nickname = getFacebookName(accountId)  // 属性初始化
}

fun main(args: Array<String>) {
    println(PrivateUser("test@kotlinlang.org").nickname)
    println(SubscribingUser("test@kotlinlang.org").nickname)
    println(FacebookUser(123456).nickname)
}
