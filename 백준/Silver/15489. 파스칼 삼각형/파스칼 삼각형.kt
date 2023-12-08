
import java.util.*


val br = System.`in`.bufferedReader()
fun brr() = br.readLine().split(' ').map { it.toInt() }
fun list()= br.readLine().split(' ').map { it.toInt() }.toIntArray()
fun main() = with(System.out.bufferedWriter()) {
    val st = StringTokenizer(br.readLine())
    val r = st.nextToken().toInt()
    val c = st.nextToken().toInt()
    val w = st.nextToken().toInt()
    val dp = Array(r + w + 1) { IntArray(r + w + 1) }
    dp[1][1] = 1
    for (i in 2..r + w) {
        for (j in 1..i) {
            dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j]
        }
    }
    var result = 0
    for (i in 0 until w) {
        for (j in 0..i) {
            result += dp[r + i][c + j]
        }
    }
    write("${result}")
    close()
}