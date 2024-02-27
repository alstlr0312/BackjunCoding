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
    var ans = 0.0
    val dot = Array(n) {handler.br.readLine().split(' ').map { it.toDouble() }.toDoubleArray()}

    for (i in 0 until n) {
        for (j in i + 1 until n) {
            for (k in j + 1 until n) {
                val a = dot[i]
                val b = dot[j]
                val c = dot[k]
                //신발끈 공식
                var triangle = a[0]*b[1] + b[0]*c[1] + c[0]*a[1] - a[1]*b[0] - b[1]*c[0] - c[1]*a[0]
                triangle = abs(triangle) / 2
                ans = max(ans, triangle)
            }
        }
    }

    println(ans)
}