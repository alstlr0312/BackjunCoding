val br = System.`in`.bufferedReader()

fun list() = br.readLine().split(" ").map { it.toInt() }.toMutableSet()
fun input() = br.readLine().split(" ")
fun brr() = br.readLine().split(' ').map { it.toInt() }


fun main() {
    val n = br.readLine().toInt()
    val m = br.readLine().toInt()
    val dp = Array(11) { IntArray(31) }
    for (i in 1..m) {
        dp[1][i] = 1
    }
    for (i in 1..n) {
        dp[i][i] = 1
    }
    for (i in 2..n) {
        for (j in i..m) {
            dp[i][j] = dp[i][j - 1] + dp[i - 1][j - 1]
        }
    }
    print(dp[n][m])
}