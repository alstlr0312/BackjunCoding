import java.io.BufferedReader
import java.io.InputStreamReader
import java.math.BigInteger
import java.util.*
import kotlin.math.max


val br = System.`in`.bufferedReader()

fun list() = br.readLine().split(" ").map { it.toInt() }.toMutableSet()
fun input() = br.readLine().split(" ")
fun brr() = br.readLine().split(' ').map { it.toInt() }


fun main() {

    var ans = 0
    var people: Int
    var pos = 0

    val n = br.readLine().toInt()
    val arr = Array(n) { IntArray(2) }

    for (i in 0 until n) {
        val inputs = brr()
        arr[i][0] = inputs[0]
        arr[i][1] = inputs[1]
    }

    for (i in 1..5) {
        people = 0
        for (j in 0 until n) {
            if (arr[j][0] == i || arr[j][1] == i) people++
            if (ans < people) {
                ans = people
                pos = i
            }
            if (arr[j][0] != i && arr[j][1] != i) people = 0

        }
    }

    println("$ans $pos")
}