val br = System.`in`.bufferedReader()
fun brr() = br.readLine().split(' ').map { it.toInt() }
fun list()= br.readLine().split(' ').map { it.toInt() }.toIntArray()
fun main() = with(System.out.bufferedWriter()) {
    val n = br.readLine().toInt()
    val dp = LongArray(10000001)
    dp[1] = 1
    dp[2] = 2
    for (i in 3..n) {
        dp[i] = (dp[i - 1] + dp[i - 2]) % 10
    }

    write("${dp[n]}")
    close()
}
