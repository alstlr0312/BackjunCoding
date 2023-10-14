import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.IOException
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {
    //ex)
    //1->2->3
    //2->1->3
    //3->1->4->3
    //4->5
    //5->4
    //
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = Integer.parseInt(br.readLine())
    val m = Integer.parseInt(br.readLine())
    val graph: MutableList<MutableList<Int>> = ArrayList()
    val visited = BooleanArray(n + 1)

    for (i in 0..n) {
        graph.add(ArrayList())
    }

    visited[1] = true

    for (i in 0 until m) {
        val st = StringTokenizer(br.readLine())
        val ai = Integer.parseInt(st.nextToken())
        val bi = Integer.parseInt(st.nextToken())
        graph[ai].add(bi)
        graph[bi].add(ai)
    }

    dfs(1, 0, visited, graph)

    var answer = 0
    for (i in 2 until visited.size) {// i = 1은 상근이라 카운트X
        if (visited[i]) answer++
    }
    bw.write("$answer")
    bw.flush()
}

private fun dfs(point: Int, cnt: Int, visited: BooleanArray, graph: List<List<Int>>) {
    if (cnt == 2) { // 친구의 친구의 친구까지
        return
    }

    for (i in graph[point]) {
        visited[i] = true
        dfs(i, cnt + 1, visited, graph)
    }
}
