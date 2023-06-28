import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val sb = StringBuilder()

    val n = br.readLine().toInt()
    val sum = IntArray(n + 1)

    val st = StringTokenizer(br.readLine())
    for (i in 1..n) {
        sum[i] = sum[i - 1] + st.nextToken().toInt()
    }

    val m = br.readLine().toInt()
    repeat(m) {
        val (i, j) = br.readLine().split(" ").map { it.toInt() }
        sb.append(sum[j] - sum[i - 1]).append("\n")
    }

    println(sb)
}
