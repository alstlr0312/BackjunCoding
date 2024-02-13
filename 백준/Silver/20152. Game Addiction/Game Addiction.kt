import java.util.*


val br = System.`in`.bufferedReader()

fun list() = br.readLine().split(" ").map { it.toInt() }.toMutableSet()
fun input() = br.readLine().split(" ")
fun brr() = br.readLine().split(' ').map { it.toInt() }
    
fun main() {
    val(h,n)=brr()
    val d: Int = Math.abs(n - h)
    val dp = Array(d + 1) { LongArray(d + 1) }
    Arrays.fill(dp[0], 1)
    for (i in 1..d) {
        dp[i][i] = dp[i - 1][i]
        for (j in i + 1..d) {
            dp[i][j] = dp[i][j - 1] + dp[i - 1][j]
        }
    }
    println(dp[d][d])
}
