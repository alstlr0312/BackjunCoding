val br = System.`in`.bufferedReader()
fun brr() = br.readLine().split(' ').map { it.toInt() }
fun list()= br.readLine().split(' ').map { it.toInt() }.toIntArray()
lateinit var dp: Array<LongArray>
fun main() = with(System.out.bufferedWriter()) {
    val (n, m) = brr()
    dp = Array(n + 1) { LongArray(m + 1) { -1L } }
    write("${dp(n, m) % 1000000007}")
    close()
}
fun dp(n: Int, m: Int): Long {
    if (n == 0 || m == 0) return 0
    if (n == 1 && m == 1) return 1
    if (dp[n][m] != -1L) return dp[n][m]

    val result = (dp(n, m - 1) + dp(n - 1, m) + dp(n - 1, m - 1)) % 1000000007
    dp[n][m] = result
    return result
}
