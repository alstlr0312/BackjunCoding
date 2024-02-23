import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.math.BigInteger
import java.util.*
import kotlin.math.floor
import kotlin.math.max


class InputHandler {
    val br = System.`in`.bufferedReader()
    fun list(): MutableSet<Int> = br.readLine().split(" ").map { it.toInt() }.toMutableSet()
    fun input(): List<String> = br.readLine().split(" ")
    fun brr(): List<Int> = br.readLine().split(' ').map { it.toInt() }
}
fun main() {
    val handler = InputHandler()
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val dp = IntArray(191230)
    val MOD = 1000000007
    dp[1] = 1
    dp[2] = 2
    for (i in 3 until 191230) {
        dp[i] = (dp[i - 1] % MOD + dp[i - 2] % MOD) % MOD
    }

    val T = handler.br.readLine().toInt()
    for (i in 0 until T) {
        val N = handler.br.readLine().toInt()
        bw.write("${dp[N]}\n")
    }
    bw.flush()
    bw.close()
}