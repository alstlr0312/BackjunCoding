import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.PriorityQueue

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    br.readLine()

    val a = br.readLine().split(" ").map { it.toInt() }
    val b = br.readLine().split(" ").map { it.toInt() }

    val pq = PriorityQueue<Int>()

    a.forEach { pq.offer(it) }
    b.forEach { pq.offer(it) }

    while (pq.isNotEmpty()) {
        bw.write("${pq.poll()} ")
    }
    bw.flush()
    bw.close()
}