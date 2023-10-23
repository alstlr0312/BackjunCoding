import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val sb = StringBuilder()
    val t = Integer.parseInt(br.readLine())
    repeat(t) {
        val i = Integer.parseInt(br.readLine())

        val arr = Array(i) { IntArray(i) }
        val visited = Array(i) { BooleanArray(i) }

        val st1 = StringTokenizer(br.readLine())
        val x1 = Integer.parseInt(st1.nextToken())
        val y1 = Integer.parseInt(st1.nextToken())

        val st2 = StringTokenizer(br.readLine())
        val x2 = Integer.parseInt(st2.nextToken())
        val y2 = Integer.parseInt(st2.nextToken())

        val result = bfs(i, x1, y1, x2, y2, arr, visited)
        sb.append(result).append("\n")
    }
    bw.write("$sb")
    bw.flush()
}

fun bfs(I: Int, x1: Int, y1: Int, x2: Int, y2: Int, arr: Array<IntArray>, visited: Array<BooleanArray>): Int {
    val dx = intArrayOf(1, 2, 2, 1, -1, -2, -2, -1)
    val dy = intArrayOf(2, 1, -1, -2, -2, -1, 1, 2)

    val q: Queue<Pair<Int, Int>> = LinkedList()
    q.add(Pair(x1, y1))
    visited[x1][y1] = true

    while (q.isNotEmpty()) {
        val now = q.poll()
        //현재 위치
        val nx = now.first
        val ny = now.second

        for (i in 0 until 8) {
            val ox = nx + dx[i]
            val oy = ny + dy[i]

            if (ox >= 0 && oy >= 0 && ox < I && oy < I) {
                if (!visited[ox][oy]) {
                    q.add(Pair(ox, oy))
                    arr[ox][oy] = arr[nx][ny] + 1
                    visited[ox][oy] = true
                }
            }
        }
    }

    return arr[x2][y2]
}