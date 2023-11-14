import java.io.BufferedReader
import java.io.InputStreamReader
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val t = br.readLine().toInt()
    var n: Int
    repeat(t){
        n=br.readLine().toInt()
        println(solve(n))
    }

}
fun solve(n: Int): Long {
    val dp = LongArray(1000)
    dp[0] = 0
    dp[1] = 1
    dp[2] = 1
    dp[3] = 1
    dp[4] = 2
    dp[5] = 2

    for (i in 6..n) {
        dp[i] = dp[i - 1] + dp[i - 5]
    }

    return dp[n]
}