import java.util.*

val br = System.`in`.bufferedReader()
fun brr() = br.readLine().split(' ').map { it.toInt() }
fun list()= br.readLine().split(' ').map { it.toInt() }.toIntArray()
//val dp = Array(n + 1) { IntArray(n + 1) }
fun main() = with(System.out.bufferedWriter()) {
    val n = br.readLine().toInt()
    write(if (n % 7 == 1 || n % 7 == 3) "CY" else "SK")
    close()
}
