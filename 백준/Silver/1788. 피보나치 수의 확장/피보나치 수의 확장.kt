import java.util.*

val br = System.`in`.bufferedReader()
fun brr() = br.readLine().split(' ').map { it.toInt() }
fun list()= br.readLine().split(' ').map { it.toInt() }.toIntArray()
//val dp = Array(n + 1) { IntArray(n + 1) }
fun main() = with(System.out.bufferedWriter()) {
    val n = br.readLine().toInt() + 1000000
    val dp = LongArray(2000001)
    dp[1000001] = 1
    if (n < 1000000) {
        for (i in 999999 downTo n) {
            dp[i] = (dp[i + 2] - dp[i + 1]) % 1000000000
        }
    } else {
        for (i in 1000002..n) {
            dp[i] = (dp[i - 1] + dp[i - 2]) % 1000000000
        }
    }
    if (dp[n] > 0) write("1\n")
    if (dp[n] == 0L) write("0\n")
    if (dp[n] < 0) write("-1\n")
    write("${Math.abs(dp[n])}")
    close()
}
