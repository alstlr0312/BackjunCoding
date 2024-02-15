import java.math.BigInteger


val br = System.`in`.bufferedReader()

fun list() = br.readLine().split(" ").map { it.toInt() }.toMutableSet()
fun input() = br.readLine().split(" ")
fun brr() = br.readLine().split(' ').map { it.toInt() }

fun main() {
    val n= br.readLine().toInt()
    val score = IntArray(n + 1)
    val dp = IntArray(n + 1)
    for (i in 1..n) {
        score[i] = br.readLine().toInt()
    }
    dp[0] = 0
    dp[1] = score[1]
    var result = dp[1]

    for (i in 2..n) {
        dp[i] = score[i]
        for (j in 1 until i) {
            if (score[j] < score[i]) {
                dp[i] = maxOf(dp[i], dp[j] + score[i])
            }
        }
        result = maxOf(result, dp[i])
    }

    println(result)
}