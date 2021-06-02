package ch03.ex6_2_LocalFunctionsAndExtensions1

class User(val id: Int, val name: String, val address: String)

fun saveUser(user: User) {

    // 申明局部函数来验证所有字段
    fun validate(user: User,
                 value: String,
                 fieldName: String) {
        if (value.isEmpty()) {
            throw IllegalArgumentException(
                "Can't save user ${user.id}: empty $fieldName")
        }
    }

    // 函数调用验证
    validate(user, user.name, "Name")
    validate(user, user.address, "Address")

    // Save user to the database
}

fun main(args: Array<String>) {
    saveUser(User(1, "", ""))
}
