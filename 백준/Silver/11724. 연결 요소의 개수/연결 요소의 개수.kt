import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val (n, m) = br.readLine().split(" ").map { it.toInt() }
    val a = Array(n + 1) { ArrayList<Int>() }
    for (i in 0 until m) {
        val (u, v) = br.readLine().split(" ").map { it.toInt() }
        //간선 추가
        a[u].add(v)
        a[v].add(u)
    }
    //연결 요소 개수
    var count = 0
    //방문 여부 확인
    val visited = BooleanArray(n + 1)
    //간선마다 연결 여부 확인
    for (i in 1..n) {
        if (!visited[i]) {
            dfs(a, i, visited)
            count++
        }
    }
    println(count)
}
fun dfs(graph: Array<ArrayList<Int>>, v: Int, visited: BooleanArray) {
    visited[v] = true
    for (i in graph[v]) {
        if (!visited[i]) {
            dfs(graph, i, visited)
        }
    }
}
