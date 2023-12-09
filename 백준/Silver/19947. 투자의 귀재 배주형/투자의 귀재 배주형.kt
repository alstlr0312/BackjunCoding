
import java.util.*

val br = System.`in`.bufferedReader()
fun brr() = br.readLine().split(' ').map { it.toInt() }
fun list()= br.readLine().split(' ').map { it.toInt() }.toIntArray()
fun main() = with(System.out.bufferedWriter()) {
    var (h, y) = brr()
    val dp = IntArray(y + 1) { 0 }
    dp[0] = h

    for (i in 1..y) {
        if (i >= 5) {
            dp[i] = maxOf(dp[i - 1] * 1.05, dp[i - 3] * 1.2, dp[i - 5] * 1.35).toInt()
        } else if (i >= 3) {
            dp[i] = maxOf(dp[i - 1] * 1.05, dp[i - 3] * 1.2).toInt()
        } else {
            dp[i] = (dp[i - 1] * 1.05).toInt()
        }
    }

    write("${dp[y]}")
    close()
}