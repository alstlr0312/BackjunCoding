import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
lateinit var arr: IntArray
lateinit var visited: BooleanArray
val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = Integer.parseInt(br.readLine())

    arr = IntArray(n)
    visited = BooleanArray(n + 1)

    dfs(0, n)
}

fun dfs(cnt: Int, n: Int) {
    if (cnt == n) {
        for (i in arr) {
            bw.write("$i ")
        }
        bw.flush()
        println()
        return
    }
    for (i in 1..n) {
        if (!visited[i]) {
            visited[i] = true
            arr[cnt] = i
            dfs(cnt + 1, n)
            visited[i] = false
        }
    }
}