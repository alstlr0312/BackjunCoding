import java.math.BigInteger
import kotlin.math.max

val br = System.`in`.bufferedReader()
fun brr() = br.readLine().split(' ').map { it.toInt() }
fun list()= br.readLine().split(' ').map { it.toInt() }.toIntArray()

fun main() = with(System.out.bufferedWriter()){
    val t=br.readLine().toInt()
    val dp = LongArray(68)
    dp[0] = 1
    dp[1] = 1
    dp[2] = 2
    dp[3] = 4
    for (i in 4..67) {
        dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3] + dp[i - 4]
    }
    repeat(t) {
        val n= br.readLine().toInt()
        write("${dp[n]}\n")
    }
    close()
}