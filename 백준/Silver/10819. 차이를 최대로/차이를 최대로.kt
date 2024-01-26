import java.util.*


val br = System.`in`.bufferedReader()

fun list() = br.readLine().split(" ".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
fun input() = br.readLine().split(" ")
fun brr() = br.readLine().split(' ').map { it.toInt() }
private var n = 0
private lateinit var arr : Array<Int>
private lateinit var visit : Array<Boolean>
private lateinit var minus : Array<Int>
var result = Integer.MIN_VALUE
fun main() = with(System.out.bufferedWriter()) {
    n = br.readLine().toInt()
    arr = Array(n, {0})
    visit = Array(n, {false})
    minus = Array(n, {0})

    var st = StringTokenizer(br.readLine())
    for(i in 0..n-1) {
        arr[i] = st.nextToken().toInt()
    }
    Arrays.sort(arr)
    dfs(0)
    write("$result")
    flush()
}

private fun dfs(depth : Int) {
    if(depth == n) {
        var sum = 0;
        for(i in 1 until n) {
            sum += Math.abs(minus[i-1] - minus[i])
        }
        result = Math.max(result, sum)
        return
    }
    for(i in 0 until n) {
        if(visit[i]) continue;
        visit[i] = true;
        minus[depth] = arr[i];
        dfs(depth + 1)
        visit[i] = false;
    }

}