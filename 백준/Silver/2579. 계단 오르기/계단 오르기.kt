import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = System.out.bufferedWriter()

    val n = br.readLine().toInt()
    val dp = IntArray(n+1)
    val arr = IntArray(n){ br.readLine().toInt() }

    dp[1] = arr[0]
    if(n > 1) {
        dp[2] = arr[0] + arr[1]
    }
    for(i in 3 .. n) {
        dp[i] = max(dp[i - 2], dp[i - 3]+ arr[i - 2]) + arr[i - 1]
    }

    bw.write("${dp[n]}")
    bw.flush()

}