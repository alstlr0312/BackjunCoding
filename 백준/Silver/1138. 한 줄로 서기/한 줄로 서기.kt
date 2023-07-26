import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val arr = br.readLine().split(" ").map(String::toInt)
    val result = IntArray(n)

    for (i in 0 until n) {
        var cnt = 0
        for (j in 0 until n) {
            if (cnt == arr[i] && result[j] == 0) {
                result[j] = i + 1
                break
            } else if (result[j] == 0) {
                cnt += 1
            }
        }
    }

    bw.write(result.joinToString(" "))
    bw.flush()
    bw.close()
    br.close()
}