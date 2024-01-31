import java.io.BufferedReader
import java.io.IOException
import java.util.*


val br = System.`in`.bufferedReader()

fun list() = br.readLine().split(" ").map { it.toInt() }.toMutableSet()
fun input() = br.readLine().split(" ")
fun brr() = br.readLine().split(' ').map { it.toInt() }

var result = 0

lateinit var map: Array<IntArray>
var dx = arrayOf(0, 0, 1, -1, 1, 1, -1, -1)
var dy = arrayOf(1, -1, 0, 0, 1, -1, -1, 1)


fun main() = with(System.out.bufferedWriter()) {
    val (n, m) = br.readLine().split(" ").map { it.toInt() }
    map = Array(n) { IntArray(m) }
    val q: Queue<IntArray> = LinkedList()

    for (i in 0 until n) {
        val row = StringTokenizer(br.readLine())
        for (j in 0 until m) {
            map[i][j] = row.nextToken().toInt()
            if (map[i][j] == 1) {
                q.add(intArrayOf(i, j))
            }
        }
    }
    println(bfs(n, m, q) - 1)
    close()
}
fun bfs(n: Int, m: Int, q: Queue<IntArray>): Int {
    val visited = Array(n) { BooleanArray(m) }
    var check = 2

    while (q.isNotEmpty()) {
        val now = q.poll()
        for (i in 0 until 8) {
            val nextX = now[0] + dx[i]
            val nextY = now[1] + dy[i]
            if (nextX < 0 || nextY < 0 || nextX >= n || nextY >= m) {
                continue
            }
            if (map[nextX][nextY] >= 1) {
                continue
            }
            visited[nextX][nextY] = true
            map[nextX][nextY] = map[now[0]][now[1]] + 1
            q.add(intArrayOf(nextX, nextY))
            check = map[nextX][nextY].coerceAtLeast(check)
        }
    }

    return check
}
