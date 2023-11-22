import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer
import kotlin.math.max

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()
    val grape = Array(n+1){0}
    val dp = Array(n+1){0}

    for (i in 1..n) {
        grape[i] = br.readLine().toInt()
    }

    for (i in dp.indices) {
        when (i) {
            0 -> dp[i] = grape[0]
            1 -> dp[i] = grape[1]
            2 -> dp[i] = grape[1] + grape[2]
            else -> {
                dp[i]=max(max(dp[i - 1], grape[i] + dp[i - 2]), grape[i] + grape[i - 1] + dp[i - 3])
            }
        }
    }

    println(dp[n])
}