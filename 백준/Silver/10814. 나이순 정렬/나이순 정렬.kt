import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    var n = br.readLine().toInt()

    val arr = Array(n) { br.readLine().split(" ") }
    arr.sortWith(compareBy({ it[0].toInt() }))
    for (i in 0 until n) {
        bw.write(arr[i].joinToString(" "))
        bw.newLine()
    }
    bw.flush()
}
