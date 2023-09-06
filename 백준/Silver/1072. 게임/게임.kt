import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val (x, y) = br.readLine().split(" ").map { it.toLong() }
    val z = 100 * y / x
    var result =  0
    if (100 * y / x>=99) {
        bw.write("-1")
        bw.flush()
        return
    }

    val a = x * z + x - 100L * y
    val b = 99L - z

    if (a % b != 0L) {
        result= (a / b + 1L).toInt()
        bw.write("$result")
        bw.flush()
    }
    else {
        result = (a/b).toInt()
        bw.write("$result")
        bw.flush()
    }


}