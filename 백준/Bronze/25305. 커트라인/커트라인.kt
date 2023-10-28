import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val (n, m) = br.readLine().split(" ").map { it.toInt() }
    val st = StringTokenizer(br.readLine())
    val arr = IntArray(n) { st.nextToken().toInt() }
    arr.sortDescending()

    bw.write("${arr[m-1]}")
    bw.flush()
}
