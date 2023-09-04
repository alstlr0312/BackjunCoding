import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val (n, k) = br.readLine().split(" ").map { it.toInt() }
    val st = StringTokenizer(br.readLine())
    val arr = Array(n) { st.nextToken().toInt() }
    arr.sort()
    bw.write("${arr[k - 1]}\n")
    bw.flush()
}
