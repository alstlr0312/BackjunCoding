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
fun main() {
    val handler = InputHandler()
    val n = handler.br.readLine().toInt()
    val grape = Array(n+1){0}
    val dp = Array(n+1){0}

    for (i in 1..n) {
        grape[i] = handler.br.readLine().toInt()
    }

    for (i in dp.indices) {
        when (i) {
            0 -> dp[i] = grape[0]
            1 -> dp[i] = grape[1]+grape[0]
            2 -> dp[i] = max(dp[1], max(grape[0] + grape[2], grape[1] + grape[2]))
            else -> { dp[i]=max(dp[i - 1], max(dp[i - 2] + grape[i], dp[i - 3] + grape[i - 1] + grape[i]))
            }
        }
    }

    println(dp[n])
}
