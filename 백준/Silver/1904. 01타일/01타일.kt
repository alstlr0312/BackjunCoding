import java.io.BufferedReader
import java.io.InputStreamReader
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()
    val dp = IntArray(n+1)
    dp[1] = 1
    if(n > 1) { 
        dp[2] = 2
    }
    for(i in 3 .. n) {
        dp[i] = (dp[i - 1] + dp[i - 2])%15746
    }
    
    println(dp[n])
}