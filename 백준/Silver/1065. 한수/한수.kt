import java.util.*

val br = System.`in`.bufferedReader()
fun brr() = br.readLine().split(' ').map { it.toInt() }
fun list()= br.readLine().split(' ').map { it.toInt() }.toIntArray()
//val dp = Array(n + 1) { IntArray(n + 1) }
fun main() = with(System.out.bufferedWriter()) {
    val n = br.readLine().toInt()
    var result = 0

    if(n < 100) {
        result = n
    } else {
        result = 99
        for(i in 100 .. n) {
            val h = i/100
            val t = (i/10)%10
            val o = i%10

            if(h - t == t - o) {
                result++
            }
        }
    }
    write("${result}")
    close()
}
