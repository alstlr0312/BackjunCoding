import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*


val br = System.`in`.bufferedReader()

fun list() = br.readLine().split(" ").map { it.toInt() }.toMutableSet()
fun input() = br.readLine().split(" ")
fun brr() = br.readLine().split(' ').map { it.toInt() }

fun main() {
    val n = br.readLine().toInt()
    val arr = IntArray(n+1)
    val dp = IntArray(n+1)
    var st: StringTokenizer
    for (i in 0 until n) {
        st = StringTokenizer(br.readLine())
        val s = st.nextToken().toInt()
        val e = st.nextToken().toInt()
        val m = st.nextToken().toInt()
        arr[i] = m
    }
    dp[0] = arr[0]
    dp[1] = maxOf(arr[0], arr[1])
    for (i in 2 until dp.size) {
        dp[i] = maxOf(dp[i - 1], dp[i - 2] + arr[i])
    }
    println(dp[n - 1])
}

