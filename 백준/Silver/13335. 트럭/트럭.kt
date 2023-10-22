import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val st = StringTokenizer(br.readLine())
    val n = st.nextToken().toInt()
    val w = st.nextToken().toInt()
    val l = st.nextToken().toInt()

    val a = IntArray(n)

    val st2 = StringTokenizer(br.readLine())
    for (i in 0 until n) {
        a[i] = st2.nextToken().toInt()
    }

    val q: Queue<Int> = LinkedList()

    var sum = 0
    var result = 0

    for (i in 0 until n) {
        while (true) {
            if (q.size == w) {
                sum -= q.poll()
            }
            if (sum + a[i] <= l) break

            q.offer(0)
            result++
        }

        q.offer(a[i])
        sum += a[i]
        result++
    }

    result += w

    bw.write("$result")
    bw.flush()
}
