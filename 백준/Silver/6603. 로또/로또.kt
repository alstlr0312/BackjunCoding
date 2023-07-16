import java.io.BufferedReader
import java.io.InputStreamReader

var n = 0
var arr: IntArray = intArrayOf()
var visited: BooleanArray = booleanArrayOf()
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    while (true) {
        val a = br.readLine()
        if (a == "0") {
            break
        }
        val get = a.split(" ")
        n = get[0].toInt()
        arr = IntArray(n)
        visited = BooleanArray(n)
        for (i in 0 until n) {
            arr[i] = get[i + 1].toInt()
        }
        dfs(0, 0)
        println()
    }
}
fun dfs(start: Int, depth: Int) {
    if (depth == 6) {
        for (i in 0 until n) {
            if (visited[i]) {
                print("${arr[i]} ")
            }
        }
        println()
    }
    for (i in start until n) {
        visited[i] = true
        dfs(i + 1, depth + 1)
        visited[i] = false
    }
}