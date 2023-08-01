import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

var n: Int = 0
var s: Int = 0
val arr = mutableListOf<Int>()
var result = 0

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val (a, b) = br.readLine().split(" ").map { it.toInt() }
    n = a
    s = b

    val garr = br.readLine().split(" ").map { it.toInt() }
    for (i in garr) {
        arr.add(i)
    }

    find(0, 0)
    if (s == 0) result--
    bw.write("$result")
    br.close()
    bw.flush()
    bw.close()
}
fun find(idx: Int, sum: Int) {
    if (idx == arr.size) {
        if (sum == s) result++
        return
    }

    find(idx + 1, sum)
    find(idx + 1, sum + arr[idx])
}