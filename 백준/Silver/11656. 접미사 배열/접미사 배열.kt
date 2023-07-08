import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {
    val s = readLine()!!
    val n = mutableListOf<String>()
    for (i in 0 until s.length) {
        n.add(s.substring(i))
    }
    n.sort()
    for (i in n) {
        print("$i ")
    }
}