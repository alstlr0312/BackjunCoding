
import javax.swing.text.html.HTML.Attribute.N


val br = System.`in`.bufferedReader()
fun brr() = br.readLine().split(' ').map { it.toInt() }
fun list()= br.readLine().split(' ').map { it.toInt() }.toIntArray()
fun main() = with(System.out.bufferedWriter()) {
    val n = br.readLine().toInt()

    val dp = IntArray(n + 1)
    dp[1] = 1

    var min = 0
    for (i in 2..n) {
        min = Int.MAX_VALUE
        var j = 1
        while (j * j <= i) {
            val temp = i - j * j
            min = Math.min(min, dp[temp])
            j++
        }
        dp[i] = min + 1
    }

    write("${dp[n]}")
    close()
}