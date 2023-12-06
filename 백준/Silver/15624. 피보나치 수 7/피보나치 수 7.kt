val br = System.`in`.bufferedReader()
fun brr() = br.readLine().split(' ').map { it.toInt() }
fun list()= br.readLine().split(' ').map { it.toInt() }.toIntArray()

fun main() = with(System.out.bufferedWriter()) {
    val n = br.readLine().toInt()
    val dp = Array(n + 2) { 0L }
    dp[1] = 1

    for (i in 2..n){
        dp[i] = (dp[i-1] + dp[i-2]) % 1000000007
    }
    write("${dp[n]}")
    close()
}