import java.util.*


val br = System.`in`.bufferedReader()
fun list()= br.readLine().split(" ".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
fun input() = br.readLine().split(" ")
fun brr() = br.readLine().split(' ').map { it.toInt() }
val dx = intArrayOf(1, -1, 0, 0, 1, -1, 1, -1)
val dy = intArrayOf(0, 0, -1, 1, 1, 1, -1, -1)
val dp = Array(21) { Array(21) { IntArray(21) } }
fun main() = with(System.out.bufferedWriter()) {
    while (true) {
        val(a,b,c)=brr()
        if (a == -1 && b == -1 && c == -1) {
            break
        }
        write("w($a, $b, $c) = ${w(a, b, c)}\n")
        flush()
    }
    close()
}

fun w(a: Int, b: Int, c: Int): Int {
    if (a <= 0 || b <= 0 || c <= 0) {
        return 1
    }
    if (a > 20 || b > 20 || c > 20) {
        return w(20, 20, 20)
    }
    if (dp[a][b][c] != 0) { //만약 이미 값이 있다면
        return dp[a][b][c]
    }
    if (a < b && b < c) {
        dp[a][b][c] = w(a, b, c - 1) + w(a, b - 1, c - 1) - w(a, b - 1, c)
        return dp[a][b][c]
    }
    dp[a][b][c] = w(a - 1, b, c) + w(a - 1, b - 1, c) + w(a - 1, b, c - 1) - w(a - 1, b - 1, c - 1)
    return dp[a][b][c]
}