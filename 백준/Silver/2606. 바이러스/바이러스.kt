import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

var n = 0 //컴퓨터 수
var c = 0 //컴퓨터 쌍
lateinit var g: Array<BooleanArray>
lateinit var visited: BooleanArray
var result = 0
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    n = br.readLine().toInt()
    c = br.readLine().toInt()
    g= Array(n + 1) { BooleanArray(n + 1) } //간선
    visited = BooleanArray(n + 1) //방문 여부 확인

    for (i in 0 until c) {
        val st = StringTokenizer(br.readLine())
        val a = st.nextToken().toInt()
        val b = st.nextToken().toInt()
        // 간선을 만들어준다
        g[a][b] = true
        g[b][a] = true
    }

    result = 0
    dfs(1)
    bw.write("${result - 1}\n")
    bw.flush()
    bw.close()
}
fun dfs(v: Int) {
    result++
    visited[v] = true
    for (i in 1..n) {
        if (!visited[i] && g[v][i]) {//방문하지 않았거나 양쪽에 간선이 있을때
            dfs(i)
        }
    }
}