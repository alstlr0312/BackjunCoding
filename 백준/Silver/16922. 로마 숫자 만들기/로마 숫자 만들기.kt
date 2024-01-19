val br = System.`in`.bufferedReader()
fun list()= br.readLine().split(" ".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
fun input() = br.readLine().split(" ")
fun brr() = br.readLine().split(' ').map { it.toInt() }
val dx = intArrayOf(1, -1, 0, 0, 1, -1, 1, -1)
val dy = intArrayOf(0, 0, -1, 1, 1, 1, -1, -1)
val romanum = intArrayOf(1,5,10,50)
var n = 0
var result=0
val visit = BooleanArray(1001)
fun main() = with(System.out.bufferedWriter()) {
    n = br.readLine().toInt()
    dfs(0, 0, 0)
    write("$result")
    close()
}

private fun dfs(depth: Int, index: Int, sum: Int) {
    if (depth == n) {
        if (!visit[sum]) {
            visit[sum] = true
            result++
        }
        return
    }
    for (i in index..3) {
        dfs(depth + 1, i, sum + romanum[i])
    }
}