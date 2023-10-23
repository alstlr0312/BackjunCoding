import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val input = br.readLine().split(" ")
    val a = input[0].toLong()
    val b = input[1].toLong()
    val c = input[2].toLong()
    val result = a+b+c
    bw.write("$result")
    bw.flush()
}

