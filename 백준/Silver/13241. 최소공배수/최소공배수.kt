import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val (a, b) = br.readLine().split(" ").map { it.toLong() }
    bw.write("${a * b / gcd(a, b)}")
    bw.flush()
}

fun gcd(a: Long, b: Long): Long = if(b != 0L) gcd(b, a % b) else a
