import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val nums = br.readLine().split(" ")
    val v = br.readLine().toInt()

    val count = nums.count { it.toInt() == v }

    bw.write(count.toString())
    bw.flush()
}
