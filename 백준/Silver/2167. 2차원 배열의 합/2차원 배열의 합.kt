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
    val m = st.nextToken().toInt()
    val arr = Array(n) { IntArray(m) }

    for (i in 0 until n) {
        val st = StringTokenizer(br.readLine())
        for (j in 0 until m) {
            arr[i][j] = st.nextToken().toInt()
        }
    }

    val k = br.readLine().toInt()
    repeat(k) {
        val st = StringTokenizer(br.readLine())
        val i = st.nextToken().toInt() - 1
        val j = st.nextToken().toInt() - 1
        val x = st.nextToken().toInt() - 1
        val y = st.nextToken().toInt() - 1
        var sum = 0

        for (i in i..x) {
            for (j in j..y) {
                sum += arr[i][j]
            }
        }
        bw.write("$sum\n")
    }
    br.close()
    bw.flush()
    bw.close()
}