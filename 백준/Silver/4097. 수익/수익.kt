import java.util.*

val br = System.`in`.bufferedReader()

fun list() = br.readLine().split(" ").map { it.toInt() }.toMutableSet()
fun input() = br.readLine().split(" ")
fun brr() = br.readLine().split(' ').map { it.toInt() }

fun main() {
    while(true){
        val n = br.readLine().toInt()
        if(n == 0) break
        val input = IntArray(n){ br.readLine().toInt()}
        val dp = IntArray(n+1)
        var result = -10000
        for(i in 1 .. n){
            dp[i] = input[i-1].coerceAtLeast(dp[i-1] + input[i-1])
            result = result.coerceAtLeast(dp[i])
        }
        println(result)
    }
}