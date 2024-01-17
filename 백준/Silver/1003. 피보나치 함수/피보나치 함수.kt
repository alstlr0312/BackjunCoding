import java.util.*

val br = System.`in`.bufferedReader()

fun list()= br.readLine().split(" ".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()

fun input() = br.readLine().split(" ")
var n = 0
fun brr() = br.readLine().split(' ').map { it }
val dx = intArrayOf(1, -1, 0, 0, 1, -1, 1, -1)
val dy = intArrayOf(0, 0, -1, 1, 1, 1, -1, -1)
fun main() = with(System.out.bufferedWriter()) {
    val n = br.readLine().toInt()
    val fibo = IntArray(41)
    fibo[1]=1
    fibo[2]=1
    for (i in 3 until 41) {
        fibo[i] = fibo[i - 1] + fibo[i - 2]
    }

    for (i in 0 until n) {
        val b = br.readLine().toInt()
        when (b) {
            0 -> write("1 0\n")
            1 -> write("0 1\n")
            else -> write("${fibo[b - 1]} ${fibo[b]}\n")
        }
    }
    close()
}
