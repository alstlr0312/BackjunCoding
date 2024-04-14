import java.util.*


class InputHandler {
    val br = System.`in`.bufferedReader()
    fun list(): MutableSet<Int> = br.readLine().split(" ").map { it.toInt() }.toMutableSet()
    fun input(): List<String> = br.readLine().split(" ")
    fun brr(): List<Int> = br.readLine().split(' ').map { it.toInt() }
}

fun main()= with(System.out.bufferedWriter()) {
    val handler = InputHandler()

    val (a,k) = handler.brr()
    val dp = IntArray(k + 1)
    Arrays.fill(dp, 1000001)
    dp[a] = 0
    for (i in a + 1..k) {
        dp[i] = dp[i - 1]
        if (i % 2 == 0 && dp[i] > dp[i / 2]) dp[i] = dp[i / 2]
        dp[i]++
    }
    write("${dp[k]}")
    close()
}
