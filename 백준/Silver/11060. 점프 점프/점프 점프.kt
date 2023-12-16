import java.util.*


val br = System.`in`.bufferedReader()
fun brr() = br.readLine().split(' ').map { it.toInt() }
fun list()= br.readLine().split(' ').map { it.toInt() }.toIntArray()
fun main() = with(System.out.bufferedWriter()) {
    val n = br.readLine().toInt()
    val st = StringTokenizer(br.readLine())
    val arr = IntArray(n + 1)
    for (i in 1..n) arr[i] = st.nextToken().toInt()
    val dp = IntArray(n + 1)
    Arrays.fill(dp, 1001)
    dp[1] = 0
    for (i in 1..n) {
        for (j in i + 1 until i + 1 + arr[i]) {
            if (j > n) break
            dp[j] = Math.min(dp[i] + 1, dp[j])
        }
    }

    write(if (dp[n] == 1001) "-1" else dp[n].toString())
    close()
}
