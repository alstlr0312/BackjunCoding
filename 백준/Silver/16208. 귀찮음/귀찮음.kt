import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = br.readLine().toInt()
    val arr = LongArray(n)
    var total: Long = 0 //막대 총 길이
    val st = StringTokenizer(br.readLine())
    for (i in 0 until n) {
        arr[i] = st.nextToken().toLong()
        total += arr[i]
    }
    var result: Long = 0
    //막대를 자르고 곱함
    for (i in 0 until n) {
        val temp: Long = arr[i]
        total -= temp
        result += temp * total
    }
    bw.write("$result\n")
    bw.flush()
}
