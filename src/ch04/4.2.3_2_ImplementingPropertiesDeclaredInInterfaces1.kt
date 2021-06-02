package ch04.ex2_3_2_ImplementingPropertiesDeclaredInInterfaces1

interface User {
    val email: String
    val nickname: String
        get() = email.substringBefore('@')  // 接口还可以包括具有getter和setter的属性
}
