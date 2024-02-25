import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.math.BigInteger
import java.util.*
import kotlin.math.floor
import kotlin.math.max


class InputHandler {
    val br = System.`in`.bufferedReader()
    fun list(): MutableSet<Int> = br.readLine().split(" ").map { it.toInt() }.toMutableSet()
    fun input(): List<String> = br.readLine().split(" ")
    fun brr(): List<Int> = br.readLine().split(' ').map { it.toInt() }
}
fun main() {
    val handler = InputHandler()
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = handler.br.readLine().toInt()
    bw.write("${(n + 1) / 2} ${(n * 2) / 3}")
    bw.flush()
    bw.close()
}