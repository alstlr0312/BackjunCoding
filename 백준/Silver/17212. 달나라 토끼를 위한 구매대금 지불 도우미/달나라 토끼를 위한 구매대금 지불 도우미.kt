val br = System.`in`.bufferedReader()
fun brr() = br.readLine().split(' ').map { it.toInt() }
fun list()= br.readLine().split(" ".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()

var n = 0
var result: Long = 0
fun main() = with(System.out.bufferedWriter()) {
    n = br.readLine().toInt()
    val dp = IntArray(100001)
    dp[1] = 1
    dp[2] = 1
    dp[3] = 2
    dp[4] = 2
    dp[5] = 1
    dp[6] = 2
    dp[7] = 1
    for (i in 8..n) {
        dp[i] = Math.min(dp[i - 1], Math.min(dp[i - 2], Math.min(dp[i - 5], dp[i - 7]))) + 1
    }
    write("${dp[n]}")
    close()
}
