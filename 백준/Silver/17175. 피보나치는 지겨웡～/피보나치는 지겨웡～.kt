val br = System.`in`.bufferedReader()
fun brr() = br.readLine().split(' ').map { it.toInt() }
fun list()= br.readLine().split(" ".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()

var n = 0
var result: Long = 0
fun main() = with(System.out.bufferedWriter()) {
    n = br.readLine().toInt()
    val dp = LongArray(51)
    dp[0] = 1
    dp[1] = 1
    for (i in 2..n) {
        dp[i] = (1 + dp[i - 1] + dp[i - 2]) % 1000000007
    }
    write("${dp[n]}")
    close()
}
