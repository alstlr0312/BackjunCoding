import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val (E: Int, S: Int, M: Int) = br.readLine().split(" ").map { it.toInt() }
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var e = E - 1
    var s = S - 1
    var m = M - 1
    var year = 0

    while (true) {
        if (year % 15 == e && year % 28 == s && year % 19 == m) {
            break
        }
        year++
    }

    bw.write((year + 1).toString()) 
    bw.flush()
    bw.close()
}