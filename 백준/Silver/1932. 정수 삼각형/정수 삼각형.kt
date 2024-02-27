import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.math.BigInteger
import java.util.*
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
    val triangle = Array(n + 1) {IntArray(n + 1)}
    val down = Array(n + 1) {IntArray(n + 1)}
    var result = 0

    for (i in 1..n) {
        val line = handler.brr()
        for (j in line.indices) {
            triangle[i][j + 1] = line[j]
        }
    }

    down[1][1] = triangle[1][1]
    for (i in 2..n) {
        for (j in 1..i) {
            down[i][j] = max(down[i - 1][j - 1], down[i - 1][j]) + triangle[i][j]
        }
    }

    for (i in 1..n) {
        if (result < down[n][i])
            result = down[n][i]
    }

    println(result)
}