import java.math.BigInteger
import kotlin.math.max

val br = System.`in`.bufferedReader()
fun brr() = br.readLine().split(' ').map { it.toInt() }
fun list()= br.readLine().split(' ').map { it.toInt() }.toIntArray()

fun main() = with(System.out.bufferedWriter()){
    val n=br.readLine().toInt()
    val dp = LongArray(81)
    dp[1] = 4
    dp[2] = 6
    for (i in 3..n) {
        dp[i] = dp[i - 1] + dp[i - 2]
    }
    write("${dp[n]}")
    close()
}