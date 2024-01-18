import java.util.*


val br = System.`in`.bufferedReader()
fun list()= br.readLine().split(" ".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
fun input() = br.readLine().split(" ")
fun brr() = br.readLine().split(' ').map { it.toInt() }
val dx = intArrayOf(1, -1, 0, 0, 1, -1, 1, -1)
val dy = intArrayOf(0, 0, -1, 1, 1, 1, -1, -1)
val dq: Deque<Int> = ArrayDeque()

fun main() = with(System.out.bufferedWriter()) {
    val n = br.readLine().toInt()
    val card = brr()
    val dp = IntArray(n + 1)
    dp[0] = 1 //수열의 길이

    for (i in 0 until n) {
        dp[i]=1
        for (j in 0 until i) {
            if (card[i] > card[j]) {
                dp[i] = Math.max(dp[i], dp[j] + 1)
            }
        }
    }
    write("${dp.maxOrNull()}")
    close()
}


