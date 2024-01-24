import java.util.*


val br = System.`in`.bufferedReader()

fun list() = br.readLine().split(" ".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
fun input() = br.readLine().split(" ")
fun brr() = br.readLine().split(' ').map { it.toInt() }

val visited = BooleanArray(10000)

fun main() = with(System.out.bufferedWriter()) {
    val (n,m)=brr()
    val map = Array(n+1) { IntArray(m+1) }
    val result  = Array(n+1) { IntArray(m+1) }
    for (i in 1 ..n) {
        val st = StringTokenizer(br.readLine())
        for (j in 1 ..m) {
            map[i][j] = st.nextToken().toInt()
        }
    }
    for (i in 1 .. n) {
        for (j in 1 .. m) {
            result[i][j]=Math.max(result[i-1][j], result[i][j-1])+map[i][j]
        }
    }
    println(result[n][m])
    close()
}
