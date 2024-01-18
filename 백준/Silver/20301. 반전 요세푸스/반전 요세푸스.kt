import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

val br = System.`in`.bufferedReader()
fun list()= br.readLine().split(" ".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
fun input() = br.readLine().split(" ")
fun brr() = br.readLine().split(' ').map { it.toInt() }
val dx = intArrayOf(1, -1, 0, 0, 1, -1, 1, -1)
val dy = intArrayOf(0, 0, -1, 1, 1, 1, -1, -1)
val result = IntArray(5001)
var count = 1

val dq: Deque<Int> = ArrayDeque()
fun Josephus(n: Int, k: Int, m: Int) {
    var count = 0
    var reverse = 0
    while (dq.size > 1) {
        val front = dq.removeFirst()
        count++
        if (count == k) {
            count = 0
            println("$front")
            reverse++
            if(reverse==m){
                reversejosephus(n,k,m)
                return
            }
        } else {
            dq.addLast(front)
        }

    }
    println("${dq.first()}")
}

fun reversejosephus(n: Int, k: Int, m: Int) {
    var count = 0
    var reverse = 0
    while (dq.size > 1) {
        count++
        val last = dq.removeLast()
        if (count == k) {
            count = 0
            println("$last")
            reverse++
            if(reverse==m){
                Josephus(n,k,m)
                return
            }
        } else {
            dq.addFirst(last)
        }
    }
    println("${dq.last()}")
}

fun main() = with(System.out.bufferedWriter()) {
    val(n,k,m)=brr()
    for (i in 1..n) {
        dq.addLast(i)
    }
    Josephus(n,k,m)
    close()
}


