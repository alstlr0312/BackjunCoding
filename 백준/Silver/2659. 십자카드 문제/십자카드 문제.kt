import java.util.*
import kotlin.Comparator

val br = System.`in`.bufferedReader()

fun list() = br.readLine().split(" ".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
fun input() = br.readLine().split(" ")
fun brr() = br.readLine().split(' ').map { it.toInt() }

val dx = intArrayOf(1, -1, 0, 0, 1, -1, 1, -1)
val dy = intArrayOf(0, 0, -1, 1, 1, 1, -1, -1)
var result = 0
val visited = BooleanArray(10000)

fun main() = with(System.out.bufferedWriter()) {
    val clock = PriorityQueue<Int>()
    for (a in 1..9) {
        for (b in 1..9) {
            for (c in 1..9) {
                for (d in 1..9) {
                    val number = "$a$b$c$d".toInt()
                    val number2 = "$b$c$d$a".toInt()
                    val number3 = "$c$d$a$b".toInt()
                    val number4 = "$d$a$b$c".toInt()
                    val small = minOf(number, number2, number3, number4)
                    if (!visited[small]) {
                        visited[small] = true
                        clock.add(small)
                    }
                }
            }
        }
    }

    val (a, b, c, d) = brr()
    val number = "$a$b$c$d".toInt()
    val number2 = "$b$c$d$a".toInt()
    val number3 = "$c$d$a$b".toInt()
    val number4 = "$d$a$b$c".toInt()
    val small = minOf(number, number2, number3, number4)
    val result = clock.indexOf(small) + 1

    write("$result")
    close()
}
