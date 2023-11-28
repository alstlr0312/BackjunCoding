import java.util.*
import kotlin.system.exitProcess

val br = System.`in`.bufferedReader()
fun brr() = br.readLine().split(' ').map { it.toInt() }

fun main() = with(System.out.bufferedWriter()){
    val t=br.readLine().toInt()
    val dp = Array(15){Array(15){0} }

    for (i in 0 until 15) {
        for (j in 0 until 15) {
            if (i == 0 || j == 0) dp[i][j] = j + 1
            else dp[i][j] = dp[i - 1][j] + dp[i][j - 1]
        }
    }

    repeat(t) {
        val k = br.readLine().toInt()
        val n = br.readLine().toInt()
        write("${dp[k][n - 1]}\n")
    }
    close()
}