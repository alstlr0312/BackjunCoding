
import java.util.*


val br = System.`in`.bufferedReader()
fun brr() = br.readLine().split(' ').map { it.toInt() }
fun list()= br.readLine().split(' ').map { it.toInt() }.toIntArray()
fun main() = with(System.out.bufferedWriter()) {
    val n = br.readLine().toInt()
    val dp = IntArray(11)
    dp[2] = 1
    for (i in 3..n) {
        dp[i] = i - 1 + dp[i - 1]
    }
    write("${dp[n]}")
    close()
}