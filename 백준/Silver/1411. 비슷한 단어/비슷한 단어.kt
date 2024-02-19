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
    val n = br.readLine().toInt()

    val words = Array(n + 1) { "" }
    for (i in 1..n) {
        words[i] = br.readLine()
    }
    var cnt = 0
    for (i in 1 until n) {
        for (j in i + 1..n) {
            if (words[i].length != words[j].length) {
                continue
            }

            var flag = false
            val visited1 = IntArray(27)
            val visited2 = IntArray(27)
            for (k in words[i].indices) {
                val idx1 = words[i][k] - 'a' + 1
                val idx2 = words[j][k] - 'a' + 1
                if (visited1[idx1] == 0 && visited2[idx2] == 0) {
                    visited1[idx1] = idx2
                    visited2[idx2] = idx1
                } else if(visited1[idx1] != idx2) {
                    flag = true
                }
            }
            if (!flag) {
                cnt++
            }
        }
    }
    println(cnt)
}