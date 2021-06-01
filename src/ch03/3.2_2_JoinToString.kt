package ch03.JoinToString

fun <T> joinToString(
        collection: Collection<T>,      // 集合对象 
        separator: String,              // 分割字符串，可以设置默认参数
        prefix: String,                 // 包装的前缀，可以设置默认参数        
        postfix: String                 // 包装的后缀，可以设置默认参数      
): String {

    val result = StringBuilder(prefix)

    for ((index, element) in collection.withIndex()) {
        
        // 添加分隔字符串
        if (index > 0) result.append(separator)

        result.append(element)
    }

    result.append(postfix)
    return result.toString()
}

fun main(args: Array<String>) {
    val list = listOf(1, 2, 3)
    println(joinToString(list, "; ", "(", ")"))
}
