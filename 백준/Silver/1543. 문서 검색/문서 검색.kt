import java.io.BufferedReader
import java.util.*


val br = System.`in`.bufferedReader()
fun brr() = br.readLine().split(' ').map { it.toInt() }
//fun list()= br.readLine().split(' ').map { it.toInt() }.toIntArray()
//val dp = Array(n + 1) { IntArray(n + 1) }
var sb = StringBuilder()
fun main() = with(System.out.bufferedWriter()) {
    val a = br.readLine()
    val b = br.readLine()
    var result=0
    var index=0

    while (index + b.length <= a.length) {
        if (a.substring(index, index + b.length) == b) {
            result++
            index += b.length
        } else {
            index++
        }
    }


    write("${result}")
    close()
}

