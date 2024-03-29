import java.io.BufferedReader
import java.io.InputStreamReader

lateinit var visited: Array<Boolean>
lateinit var arr: Array<Int>

var n = 0
var m = 0

fun main() {

    val br = BufferedReader(InputStreamReader(System.`in`))
    val nm = br.readLine()!!.split(" ")
    m = nm[1].toInt()
    n = nm[0].toInt()
    arr = Array(n + 1) { i -> i }
    visited = Array(n + 1) { false }

    dfs(1, 0, "")
}

fun dfs(idx: Int, len: Int, str: String) {

    if (len == m) {
        println(str)
        return
    }

    for (i in 1..n) {
        if (!visited[i]) {
            visited[i] = true

            if (len == 0)
                dfs(i, 1, arr[i].toString())
            else
                dfs(i, len + 1, "$str ${arr[i]}")

            visited[i] = false
        }
    }
}
