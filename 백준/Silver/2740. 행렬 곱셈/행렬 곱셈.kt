import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val (n, m) = br.readLine().split(" ").map { it.toInt() }
    val a = Array(n) { br.readLine().split(" ").map { it.toInt() }.toIntArray() }
    
    val (M, k) = br.readLine().split(" ").map { it.toInt() }
    val B = Array(M) { br.readLine().split(" ").map { it.toInt() }.toIntArray() }

    for (i in 0 until n) {
        val result = IntArray(k)
        for (l in 0 until k) {
            var x = 0
            for (j in 0 until m) {
                x += a[i][j] * B[j][l]
            }
            result[l] = x
        }
        bw.write(result.joinToString(" "))
        bw.newLine()
    }
    bw.flush()
}

