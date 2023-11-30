val br = System.`in`.bufferedReader()
fun brr() = br.readLine().split(' ').map { it.toInt() }

fun main() = with(System.out.bufferedWriter()){
    var n=br.readLine().toInt()
    val arr = Array(n) { br.readLine().split(" ").map { it.toInt() } }
    val dp = Array(n + 1) { 0 }
    for (i in 0 until n) {
        if (i + arr[i][0] <= n) {
            if (i > 0) dp[i] = maxOf(dp[i], dp[i - 1])
            dp[i + arr[i][0]] = maxOf(dp[i + arr[i][0]], dp[i] + arr[i][1])
        }
    }
    write("${dp.maxOrNull()!!}")
    close()
}