import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader
import java.util.*

val br = System.`in`.bufferedReader()
fun brr() = br.readLine().split(' ').map { it.toInt() }
fun list()= br.readLine().split(" ".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
fun main() = with(System.out.bufferedWriter()) {
    val sb = StringBuilder()
    val (n,m)=brr()
    val dp = Array(n + 1) { IntArray(n + 1) }
    for (i in 1..n) {
        val st = StringTokenizer(br.readLine())
        for (j in 1..n) {
            dp[i][j] = dp[i][j - 1] + st.nextToken().toInt()
        }
    }
    for (k in 1..m) {
        var sum = 0
        val st = StringTokenizer(br.readLine())
        val x1 = st.nextToken().toInt()
        val y1 = st.nextToken().toInt()
        val x2 = st.nextToken().toInt()
        val y2 = st.nextToken().toInt()
        for (i in x1..x2) {
            sum = sum + (dp[i][y2] - dp[i][y1 - 1])
        }
        sb.append(sum.toString() + "\n")
    }
    write("${sb}")
    close()
}


