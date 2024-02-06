import java.util.*


val br = System.`in`.bufferedReader()

fun list() = br.readLine().split(" ").map { it.toInt() }.toMutableSet()
fun input() = br.readLine().split(" ")
fun brr() = br.readLine().split(' ').map { it.toInt() }

fun main() {
    val n = br.readLine().toInt()
    val arr = IntArray(n+1)
    val dp = IntArray(n+1)
    val st = StringTokenizer(br.readLine())
    for (i in 1..n) {
        arr[i] = st.nextToken().toInt()
        dp[i] = arr[i]
    }
    var max = 0
    for (i in 1..n) {
        for (j in 1 until i) {
            if (arr[i] < arr[j]) dp[i] = Math.max(dp[i], dp[j] + arr[i])
        }
        max = Math.max(max, dp[i])
    }
    print(max)

}



