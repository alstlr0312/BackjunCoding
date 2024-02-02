import java.util.*

val br = System.`in`.bufferedReader()

fun list() = br.readLine().split(" ").map { it.toInt() }.toMutableSet()
fun input() = br.readLine().split(" ")
fun brr() = br.readLine().split(' ').map { it.toInt() }


lateinit var map: Array<IntArray>
lateinit var visited: Array<BooleanArray>
var n: Int = 0
var min: Int = Int.MAX_VALUE
val dx = intArrayOf(-1, 1, 0, 0)
val dy = intArrayOf(0, 0, -1, 1)

fun main() {
    n = br.readLine().toInt()
    map = Array(n) { IntArray(n) }
    visited = Array(n) { BooleanArray(n) }

    for (i in 0 until n) {
        val st = StringTokenizer(br.readLine())
        for (j in 0 until n) {
            map[i][j] = st.nextToken().toInt()
        }
    }
    dfs(0, 0)
    println(min)
}

fun dfs(depth: Int, sum: Int) {
    if (depth == 3) {
        min = min.coerceAtMost(sum)
        return
    }
    for (i in 0 until n) {
        for (j in 0 until n) {
            //심을 수 있는지 확인
            var possible = true
            if (visited[i][j]) possible = false
            for (k in 0 until 4) {
                val nx = i + dx[k]
                val ny = j + dy[k]
                if (nx >= n || ny >= n || nx < 0 || ny < 0 || visited[nx][ny]) {
                    possible = false
                    break
                }
            }
            //확인되면 심음
            if (possible) {
                var seedcost = map[i][j]
                for (k in 0 until 4) {
                    val nx = i + dx[k]
                    val ny = j + dy[k]
                    seedcost += map[nx][ny]
                }
                //심은데 방문
                visited[i][j] = true
                for (k in 0 until 4) {
                    val nx = i + dx[k]
                    val ny = j + dy[k]

                    visited[nx][ny] = true
                }
                dfs(depth + 1, sum + seedcost)

                visited[i][j] = false
                for (k in 0 until 4) {
                    val nx = i + dx[k]
                    val ny = j + dy[k]
                    visited[nx][ny] = false
                }
            }
        }
    }
}
