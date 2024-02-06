import java.util.*

val br = System.`in`.bufferedReader()

fun list() = br.readLine().split(" ").map { it.toInt() }.toMutableSet()
fun input() = br.readLine().split(" ")
fun brr() = br.readLine().split(' ').map { it.toInt() }

fun main() {
    val (n,m) = brr()
    if (n == 1) {
        println(1)
    } else if (n == 2) { //2,3번 가로 홀수칸 이용
        println(minOf(4, (m + 1) / 2))
    } else if (m < 7) {
        println(minOf(4, m))
    } else {
        println(m - 7 + 5)
    }
}



