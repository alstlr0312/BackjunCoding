import java.io.BufferedReader
import java.io.IOException


val br = System.`in`.bufferedReader()
fun brr() = br.readLine().split(' ').map { it.toInt() }
fun list()= br.readLine().split(" ".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
fun main() = with(System.out.bufferedWriter()) {
    val n = br.readLine().toInt()
    val map = mutableMapOf<String, Int>()
    for (i in 1..n) {
        val book = br.readLine()
        if (map.containsKey(book)) {
            val currentValue = map[book] ?: 0
            map[book] = currentValue + 1
        } else {
            map[book] = 1
        }
    }
    val maxValue = map.maxByOrNull { it.value }?.value
    val result = map.filterValues { it == maxValue }
        .minByOrNull { it.key }
        ?.key
    write("${result}")
    close()
}


