import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val (n, l) = br.readLine().split(" ").map { it.toInt() }
    val st = StringTokenizer(br.readLine())
    val v = IntArray(n) { st.nextToken().toInt() }

    v.sort()

    var count = l
    for (i in 0 until n) {
        if (v[i] <= count) {
            count += 1
        }
    }

    println(count)
}