import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val inputs = br.readLine().split(" ")
    val n = inputs[0].toInt()
    val m = inputs[1].toInt()

    val building = Array(n) { CharArray(m) }
    var result = 0

    for (i in 0 until n) {
        val floor = br.readLine()
        for (j in 0 until m) {
            building[i][j] = floor[j]
        }
    }

    for (i in 0 until n) {
        for (j in 0 until m) {
            if (building[i][j] == '-') {
                if (j + 1 < m && building[i][j + 1] == '|' || j == m - 1) {
                    result++
                }
            }

            if (building[i][j] == '|') {
                if (i + 1 < n && building[i + 1][j] == '-' || i == n - 1) {
                    result++
                }
            }
        }
    }

    bw.write(result.toString())
    bw.flush()
}
