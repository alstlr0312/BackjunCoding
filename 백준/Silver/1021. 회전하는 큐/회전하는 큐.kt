import java.util.*

val br = System.`in`.bufferedReader()
fun brr() = br.readLine().split(' ').map { it.toInt() }
fun list()= br.readLine().split(' ').map { it.toInt() }.toIntArray()
fun main() = with(System.out.bufferedWriter()) {
    val (n,m) = brr()
    val list = list()
    val q = LinkedList<Int>()
    for (i in 1..n){
        q.add(i)
    }
    var result = 0
    var count = 0
    while (count != m) {
        if (q.first == list[count]) {
            q.poll()
        }
        else {
            for (i in 1 until q.size) {
                if (q[q.size - i] == list[count]) {
                    while (q[0] != list[count]) {
                        q.add(0, q.last)
                        q.removeLast()
                        result++
                    }
                    q.poll()
                    break
                } else if (q[i] == list[count]) {
                    while (q[0] != list[count]) {
                        q.add(q.first)
                        q.removeFirst()
                        result++
                    }
                    q.poll()
                    break
                }
            }
        }
        count++
    }
    write("${result}")
    close()
}