import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val st = StringTokenizer(br.readLine(), " ")
    val arr = IntArray(2)
    arr[0] = st.nextToken().toInt()
    arr[1] = st.nextToken().toInt()
    val c = br.readLine().toInt()
    val n0 = br.readLine().toInt()

    var result = 0
    if (arr[0] * n0 + arr[1] <= c * n0 && c >= arr[0]) {
        result = 1
    }

    bw.write("${result}\n")
    bw.flush()
    bw.close()
}
