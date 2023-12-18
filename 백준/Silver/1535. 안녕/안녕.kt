import java.util.*

val br = System.`in`.bufferedReader()
fun brr() = br.readLine().split(' ').map { it.toInt() }
fun list()= br.readLine().split(' ').map { it.toInt() }.toIntArray()
fun main() = with(System.out.bufferedWriter()) {
    val n = br.readLine().toInt()
    val k = 99
    val dp = Array(n + 1) { IntArray(k + 1) }
    val l = IntArray(n + 1)
    val j = IntArray(n + 1)
    val st = StringTokenizer(br.readLine())
    val st2 = StringTokenizer(br.readLine())
    for (i in 1..n) {
        l[i] = st.nextToken().toInt()
        j[i] = st2.nextToken().toInt()
    }
    for (i in 1..n) {
        for (k in 1..k) {
            if (l.get(i) <= k) {
                dp[i][k] = Math.max(dp[i - 1][k - l.get(i)] + j.get(i), dp[i - 1][k])
            } else {
                dp[i][k] = dp[i - 1][k]
            }
        }
    }
    write("${dp[n][k]}")
    close()
}
