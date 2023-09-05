import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val arr = Array(100) { BooleanArray(100) { false } }
    val n = br.readLine().toInt()
    var sum = 0
    repeat(n) {
        val (x, y) = br.readLine().split(" ").map { it.toInt() }

        for (i in x until x + 10) {
            for (j in y until y + 10) {
                if (!arr[i][j]) {
                    arr[i][j] = true
                    sum++
                }
            }
        }
    }
    bw.write("$sum")
    bw.flush()
}
