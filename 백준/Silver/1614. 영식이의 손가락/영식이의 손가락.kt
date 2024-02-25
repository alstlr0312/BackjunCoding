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
    val hurtfinger = handler.br.readLine().toLong()
    val count = handler.br.readLine().toLong()

    var result: Long = 0

    when (hurtfinger) {
        1L -> result = count * 8
        2L -> result = if ((count % 2).toInt() == 0) count * 4 + 1 else count * 4 + 3
        3L -> result = count * 4 + 2
        4L -> result = if ((count % 2).toInt() == 0) count * 4 + 3 else count * 4 + 1
        5L -> result = count * 8 + 4
    }

    bw.write("${result}")
    bw.flush()
    bw.close()
}