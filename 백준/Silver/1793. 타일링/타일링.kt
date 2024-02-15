import java.math.BigInteger


val br = System.`in`.bufferedReader()

fun list() = br.readLine().split(" ").map { it.toInt() }.toMutableSet()
fun input() = br.readLine().split(" ")
fun brr() = br.readLine().split(' ').map { it.toInt() }

fun main() {
    val dp = Array<BigInteger>(251) { BigInteger.ZERO }
    dp[0] = BigInteger.ONE
    dp[1] = BigInteger.ONE
    dp[2] = BigInteger("3")
    for (i in 3..250) {
        dp[i] = dp[i - 1].add(dp[i - 2].multiply(BigInteger("2")))
    }
    while (true) {
        val n = br.readLine()?.toInt()
        if (n == null) break
        println(dp[n])
    }
}