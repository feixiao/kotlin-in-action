package ch05.ex2_4_2_FlatMapFlatten1

class Book(val title: String, val authors: List<String>)

fun main(args: Array<String>) {
    val books = listOf(Book("Thursday Next", listOf("Jasper Fforde")),
                       Book("Mort", listOf("Terry Pratchett")),
                       Book("Good Omens", listOf("Terry Pratchett",
                                                 "Neil Gaiman")))

                     
    // flatMap做两件事情：
    //  根据实参给定的函数对集合的每个元素进行变换,然后把多个列表合并为一个列表                            
    println(books.flatMap { it.authors }.toSet())

    // [Jasper Fforde, Terry Pratchett, Neil Gaiman]
}
