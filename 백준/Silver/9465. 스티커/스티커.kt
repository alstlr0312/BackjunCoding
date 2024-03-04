import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.math.BigInteger
import java.util.*
import kotlin.math.abs
import kotlin.math.floor
import kotlin.math.max
import kotlin.math.min


class InputHandler {
    val br = System.`in`.bufferedReader()
    fun list(): MutableSet<Int> = br.readLine().split(" ").map { it.toInt() }.toMutableSet()
    fun input(): List<String> = br.readLine().split(" ")
    fun brr(): List<Int> = br.readLine().split(' ').map { it.toInt() }
}


fun main()= with(System.out.bufferedWriter()) {
    val handler = InputHandler()
    val t = handler.br.readLine().toInt()
    for (i in 0 until t) {
        val n =  handler.br.readLine().toInt()
        val stic = Array(2) { IntArray(n + 1) }
        val dp = Array(2) { IntArray(n + 1) }
        for (j in 0..1) {
            val sticker =  handler.br.readLine().split(" ".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
            for (k in 1..n) {
                stic[j][k] = sticker[k - 1].toInt()
            }
        }

        dp[0][1] = stic[0][1]
        dp[1][1] = stic[1][1]
        for (j in 2..n) {
            dp[0][j] = Math.max(dp[1][j - 1], dp[1][j - 2]) + stic[0][j]
            dp[1][j] = Math.max(dp[0][j - 1], dp[0][j - 2]) + stic[1][j]
        }
        write("${Math.max(dp[0][n], dp[1][n])}\n")
    }
    close()
}
