import java.io.BufferedReader
import java.io.InputStreamReader
import java.math.BigInteger
import java.util.*
import kotlin.math.floor
import kotlin.math.max


val br = System.`in`.bufferedReader()

fun list() = br.readLine().split(" ").map { it.toInt() }.toMutableSet()
fun input() = br.readLine().split(" ")
fun brr() = br.readLine().split(' ').map { it.toInt() }


fun main() {
    val(n,k)=brr()
    val arr = DoubleArray(n)
    for (i in 0 until n) {
        arr[i] = br.readLine().toDouble()
    }
    arr.sort()

    var sum = 0.0
    for (i in k until n - k) {
        sum += arr[i]
    }

    println(String.format("%.2f", sum / (n - k * 2) + 1e-8))

    for (i in 0 until k) {
        sum += arr[k]
        sum += arr[n - k - 1]
    }

    println(String.format("%.2f", sum / n + 1e-8))
}