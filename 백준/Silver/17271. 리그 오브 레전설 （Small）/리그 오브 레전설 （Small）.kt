val br = System.`in`.bufferedReader()

fun list() = br.readLine().split(" ").map { it.toInt() }.toMutableSet()
fun input() = br.readLine().split(" ")
fun brr() = br.readLine().split(' ').map { it.toInt() }


fun main() {
    val nm = brr()
    val n = nm[0]
    val m = nm[1]

    val dp = IntArray(12345)
    dp[0] = 1
    dp[1] = 1
    for (i in 2..n) {
        dp[i] = dp[i - 1]
        if (i - m >= 0) {
            dp[i] = (dp[i] + dp[i - m]) %  1000000007
        }
    }

    println(dp[n])
}