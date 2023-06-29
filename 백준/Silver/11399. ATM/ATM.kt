import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()
    val st = StringTokenizer(br.readLine())
    val arr = IntArray(n) { st.nextToken().toInt() }

    arr.sort()

    var ans = 0
    for (i in 0 until n) {
        ans += arr[i] * (n - i)
    }

    println(ans)
}