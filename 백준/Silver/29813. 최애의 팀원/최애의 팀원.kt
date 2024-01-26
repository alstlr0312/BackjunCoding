import java.util.*


val br = System.`in`.bufferedReader()

fun list() = br.readLine().split(" ".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
fun input() = br.readLine().split(" ")
fun brr() = br.readLine().split(' ').map { it.toInt() }
private var n = 0
private lateinit var arr : Array<Int>
private lateinit var visit : Array<Boolean>
private lateinit var minus : Array<Int>
var result = Integer.MIN_VALUE
fun main() = with(System.out.bufferedWriter()) {
    n = br.readLine().toInt()
    val deque: Deque<Pair<String, Int>> = ArrayDeque()
    repeat(n) {
        val (initial, number) = input()
        deque.add(Pair(initial, number.toInt()))
    }
    while (deque.size > 1) {
        val (name, num) = deque.removeFirst()
        val pos = (num - 1) % deque.size
        repeat(pos) {
            deque.addLast(deque.removeFirst())
        }
        deque.removeFirst()
    }

    println(deque.first().first)
}
