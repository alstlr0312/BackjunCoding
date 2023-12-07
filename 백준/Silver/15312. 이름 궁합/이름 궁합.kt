val br = System.`in`.bufferedReader()
fun brr() = br.readLine().split(' ').map { it.toInt() }
fun list()= br.readLine().split(' ').map { it.toInt() }.toIntArray()
fun main() = with(System.out.bufferedWriter()) {
    val A = br.readLine()
    val B = br.readLine()
    val alpha = intArrayOf(3, 2, 1, 2, 3, 3, 2, 3, 3, 2, 2, 1, 2, 2, 1, 2, 2, 2, 1, 2, 1, 1, 1, 2, 2, 1)
    val dp = Array(2 * A.length - 1) { IntArray(2 * A.length) }

    for (i in 0..A.length) {
        if (i != A.length) {
            dp[0][i * 2] = alpha[A[i].toInt() - 65]
        }
        if (i != 0) {
            dp[0][i * 2 - 1] = alpha[B[i - 1].toInt() - 65]
        }
    }

    for (i in 1 until 2 * A.length - 1) {
        for (j in 0 until 2 * A.length - i) {
            dp[i][j] = "${dp[i - 1][j] + dp[i - 1][j + 1]}".last().toString().toInt()
        }
    }

    write("${dp[dp.lastIndex][0]}${dp[dp.lastIndex][1]}")
    close()
}