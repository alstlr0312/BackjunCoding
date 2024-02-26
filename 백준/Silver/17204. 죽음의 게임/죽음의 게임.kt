import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.math.BigInteger
import java.util.*
import kotlin.math.floor
import kotlin.math.max
import kotlin.math.min


class InputHandler {
    val br = System.`in`.bufferedReader()
    fun list(): MutableSet<Int> = br.readLine().split(" ").map { it.toInt() }.toMutableSet()
    fun input(): List<String> = br.readLine().split(" ")
    fun brr(): List<Int> = br.readLine().split(' ').map { it.toInt() }
}
fun main() {
    val handler = InputHandler()
    val st = StringTokenizer(handler.br.readLine(), " ")
    val n = st.nextToken().toInt()
    val k = st.nextToken().toInt()
    val arr = IntArray(n)

    for (i in 0 until n) {
        arr[i] = handler.br.readLine().toInt()
    }

    var cnt = 0
    var idx = 0

    while (true) {
        cnt+=1
        val next = arr[idx]
        if (next == k) break
        idx = next
        if (cnt > n) break
    }

    println(if (cnt > n) -1 else cnt)
}