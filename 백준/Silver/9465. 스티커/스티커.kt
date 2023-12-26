val br = System.`in`.bufferedReader()
fun brr() = br.readLine().split(' ').map { it.toInt() }
fun list()= br.readLine().split(" ".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
fun main() = with(System.out.bufferedWriter()) {
    val t = br.readLine().toInt()
    for (i in 0 until t) {
        val n = br.readLine().toInt()
        val s = Array(2) { IntArray(n + 1) }
        val dp = Array(2) { IntArray(n + 1) }
        for (j in 0..1) {
            val input = br.readLine().split(" ".toRegex()).dropLastWhile { it.isEmpty() }
                .toTypedArray()
            for (k in 1..n) {
                s[j][k] = input[k - 1].toInt()
            }
        }

        dp[0][1] = s[0][1]
        dp[1][1] = s[1][1]
        for (j in 2..n) {
            dp[0][j] = Math.max(dp[1][j - 1], dp[1][j - 2]) + s[0][j]
            dp[1][j] = Math.max(dp[0][j - 1], dp[0][j - 2]) + s[1][j]
        }
        write("${Math.max(dp[0][n], dp[1][n])}\n")
    }
    close()
}


