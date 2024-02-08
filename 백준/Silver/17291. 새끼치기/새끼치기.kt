import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*


val br = System.`in`.bufferedReader()

fun list() = br.readLine().split(" ").map { it.toInt() }.toMutableSet()
fun input() = br.readLine().split(" ")
fun brr() = br.readLine().split(' ').map { it.toInt() }

fun main() {
    val n = br.readLine().toInt()
    val death = IntArray(21)
    val bug = IntArray(21)
    bug[1] = 1
    death[4] = 1
    for (i in 2 until 21) {
        val birth = bug[i - 1]
        bug[i] = bug[i - 1] * 2 - death[i]

        if (i % 2 == 0) {
            if (i + 4 <= 20) {
                death[i + 4] += birth
            }
        } else {
            if (i + 3 <= 20) {
                death[i + 3] += birth
            }
        }
    }
    println(bug[n])
}