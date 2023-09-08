import java.io.BufferedReader
import java.io.InputStreamReader
import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    var n: String?
    while (br.readLine().also { n = it } != null) {
        var N = n!!.toInt()
        var ans = 1
        var k = 1
        while (true) {
            if (ans % N == 0) {
                break
            } else {
                k++
                ans = ans * 10 + 1 //반복될수록 1->11->111->1111...이됨
                ans %= N
            }
        }

        bw.write("$k\n")
    }

    bw.flush()
}