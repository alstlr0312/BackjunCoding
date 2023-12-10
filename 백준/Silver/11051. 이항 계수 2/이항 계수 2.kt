val br = System.`in`.bufferedReader()
fun brr() = br.readLine().split(' ').map { it.toInt() }
fun list()= br.readLine().split(' ').map { it.toInt() }.toIntArray()
fun main() = with(System.out.bufferedWriter()) {
    val (n, k) = brr()
    val dp = Array(n + 1){ IntArray(n + 1) }
    for(i in 1 .. n) {
        dp[i][i] = 1
        dp[i][0] = 1
    }
    for(i in 2..n) {
        for (j in 1..i) {
            dp[i][j] = (dp[i - 1][j - 1] + dp[i - 1][j]) % 10007
        }
    }
    write("${dp[n][k]}")
    close()
}