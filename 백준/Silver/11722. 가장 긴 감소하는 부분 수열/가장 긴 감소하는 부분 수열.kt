import java.util.*

val br = System.`in`.bufferedReader()
fun brr() = br.readLine().split(' ').map { it.toInt() }

fun main() = with(System.out.bufferedWriter()){
    val n=br.readLine().toInt()
    val dp = Array(n + 1){0}
    var arr= Array(n+1){0}
    val m = br.readLine().split(" ").map { it.toInt() }
    for (i in 1..n){
        arr[i] = m[i - 1]
    }
    dp[1]=1
    var result= 0
    for(i in 2 .. n){
       dp[i]=1
        for(j in 0 until i){
            if (arr[i] < arr[j] && dp[i] <= dp[j]) {
                dp[i] = dp[j] + 1
            } else if (arr[i] == arr[j]) {
                dp[i] = dp[j]
            }
        }
    }
    for (i in 1..n) result = Math.max(dp.get(i), result)
    write("$result")
    close()
}