package ch08.ex2_5_UsingInlinedLambdasForResourceManagement

import java.io.BufferedReader
import java.io.FileReader
import java.io.File

fun readFirstLineFromFile(path: String): String {
    // 使用use函数做资源管理
    BufferedReader(FileReader(path)).use { br ->    // 构建BufferedReader调用use函数，传入一个lambda进行文件操作
        return br.readLine()   // 从函数中返回文件的一行
    }
}
