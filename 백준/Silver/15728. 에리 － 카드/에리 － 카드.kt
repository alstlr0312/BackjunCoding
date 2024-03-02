import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.math.BigInteger
import java.util.*
import kotlin.math.abs
import kotlin.math.floor
import kotlin.math.max
import kotlin.math.min


class InputHandler {
    val br = System.`in`.bufferedReader()
    fun list(): MutableSet<Int> = br.readLine().split(" ").map { it.toInt() }.toMutableSet()
    fun input(): List<String> = br.readLine().split(" ")
    fun brr(): List<Int> = br.readLine().split(' ').map { it.toInt() }
}


fun main()= with(System.out.bufferedWriter()) {
    val handler = InputHandler()
    val (n, k) = handler.br.readLine().split(" ").map { it.toInt() }
    val card = handler.br.readLine().split(" ").map { it.toInt() }.toIntArray()

    val pq = PriorityQueue<Int>(Collections.reverseOrder())
    val ourcard = handler.br.readLine().split(" ").map { it.toInt() }.toIntArray()
    for (i in 0 until n) {
        val nowcard = ourcard[i]
        var max = Int.MIN_VALUE
        for (j in 0 until n) {
            max = max(max, nowcard * card[j])
        }
        pq.add(max)
    }
    repeat(k) { pq.poll() }
    write("${pq.peek()}")
    close()
}
