import java.io.BufferedReader
import java.io.InputStreamReader
import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    var st: StringTokenizer?
    val t = Integer.parseInt(br.readLine())
    for (test in 0 until t) {
        val n = Integer.parseInt(br.readLine())
        val a = IntArray(n + 1)
        var permutation = 0
        st = StringTokenizer(br.readLine())
        for (i in 1 until n + 1) {
            a[i] = Integer.parseInt(st!!.nextToken())
        }
        val check = BooleanArray(n + 1)
        for (i in 1 until n + 1) {
            if (!check[i]) {
                dfs(i, check, a)
                permutation++
            }
        }
        bw.write("$permutation\n")
    }
    bw.flush()
}

fun dfs(start: Int, check: BooleanArray, map: IntArray) {
    check[start] = true
    val next = map[start]
    if (!check[next]) {
        dfs(map[start], check, map)
    }
}