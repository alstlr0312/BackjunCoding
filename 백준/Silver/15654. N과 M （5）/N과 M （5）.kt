import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

lateinit var a: IntArray
lateinit var arr: IntArray
lateinit var isVisited: BooleanArray
var n = 0
var m = 0
val sb = StringBuilder()

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val nm = StringTokenizer(br.readLine())
    n = nm.nextToken().toInt()
    m = nm.nextToken().toInt()
    a = IntArray(n)
    arr = IntArray(n)
    isVisited = BooleanArray(n)
    val st = StringTokenizer(br.readLine())
    for (i in 0 until n) {
        a[i] = st.nextToken().toInt()
    }

    a.sort()
    dfs(0)
    println(sb.toString())
}

fun dfs(count: Int) {
    if (count == m) {
        for (i in 0 until m) {
            sb.append(arr[i]).append(" ")
        }
        sb.append("\n")
        return
    }
    for (i in 0 until n) {
        if (!isVisited[i]) {
            isVisited[i] = true
            arr[count] = a[i]
            dfs(count + 1)
            isVisited[i] = false
        }
    }
}