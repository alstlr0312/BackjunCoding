import java.util.*

val br = System.`in`.bufferedReader()
fun brr() = br.readLine().split(' ').map { it.toInt() }
//fun list()= br.readLine().split(' ').map { it.toInt() }.toIntArray()
//val dp = Array(n + 1) { IntArray(n + 1) }
fun main() = with(System.out.bufferedWriter()) {
    val(n,m)=brr()
    var result = 0
    val st = StringTokenizer(br.readLine())
    val arr = Array(n) { st.nextToken().toInt() }

    var start = 0
    var end = 1
    var sum = arr[0]

    while (true) {
        if (sum == m) {
            result++
            sum -= arr[start++]
        } else if (sum < m) {
            if (end == n) break
            sum += arr[end++]
        } else {
            sum -= arr[start++]
        }
    }
    write("${result}")
    close()
}
