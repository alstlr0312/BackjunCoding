
import javax.swing.text.html.HTML.Attribute.N


val br = System.`in`.bufferedReader()
fun brr() = br.readLine().split(' ').map { it.toInt() }
fun list()= br.readLine().split(' ').map { it.toInt() }.toIntArray()
fun main() = with(System.out.bufferedWriter()) {
    val (n, m) = brr()
    val map = Array<IntArray>(n + 1) { IntArray(m + 1) }
    val dp = Array<IntArray>(n + 1) { IntArray(m + 1) }

    for (i in 1..n) {
        val inputs = list()
        for (j in 1..m) {
            map[i][j] = inputs.get(j - 1)
        }
    }
    for (i in 1..n) {
        for (j in 1..m) {
            dp[i][j] = Math.max(map[i][j] + dp[i - 1][j], map[i][j] + dp[i][j - 1])
        }
    }
    write("${dp[n][m]}")
    close()
}