import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val dp = Array(n + 1) { LongArray(10) }
    for (i in 0..9) {
        dp[1][i] = 1
    }

    for (i in 2..n) {
        for (j in 0..9) {
            for (k in 0..j) {
                dp[i][j] = (dp[i][j] + dp[i - 1][k]) % 10007
            }
        }
    }

    var result: Long = 0
    for (i in 0..9) {
        result = (result + dp[n][i]) % 10007
    }

    bw.write("$result")
    bw.flush()
    bw.close()
}
