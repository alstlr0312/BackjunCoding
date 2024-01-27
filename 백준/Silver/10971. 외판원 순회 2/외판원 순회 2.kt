import java.util.*
val br = System.`in`.bufferedReader()

fun list() = br.readLine().split(" ").map { it.toInt() }.toMutableSet()
fun input() = br.readLine().split(" ")
fun brr() = br.readLine().split(' ').map { it.toInt() }

var city = 0
val cost = Array(10){ IntArray(10) }
val visited = BooleanArray(10)
var result  = Long.MAX_VALUE


fun main() = with(System.out.bufferedWriter()) {
    city = br.readLine().toInt()
    for(i in 0 until city) {
        val st = StringTokenizer(br.readLine())
        for(j in 0 until city) {
            cost[i][j] = st.nextToken().toInt()
        }
    }

    for(i in 0 until city) {
        visited.fill(false)
        visited[i] = true
        dfs(i, i, 0, 1)
    }
    write("$result")
    close()
}
fun dfs(start: Int, now: Int, res: Long, depth: Int) {
    if(depth == city) {
        if(cost[now][start] != 0) {
            result = Math.min(result, res + cost[now][0])
        }
        return
    }

    for(i in 1 until city) {
        if(!visited[i] && cost[now][i] != 0) {
            visited[i] = true
            dfs(start, i, res + cost[now][i], depth+1)
            visited[i] = false
        }
    }
}