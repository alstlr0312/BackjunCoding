import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.lang.StringBuilder
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val (n, m) = br.readLine().split(" ").map { it.toInt() }
    val nnum = br.readLine().split(" ").map { it.toInt() }
    val mnum = br.readLine().split(" ").map { it.toInt() }
    val nset = nnum.toSet()
    val mset = mnum.toSet()
    val ndifference = nset subtract mset
    val mdifference = mset subtract nset
    val result = ndifference.size+mdifference.size
    bw.write("${result}")
    bw.flush()
}