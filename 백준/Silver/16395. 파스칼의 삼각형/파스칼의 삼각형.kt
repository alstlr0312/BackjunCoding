val br = System.`in`.bufferedReader()
fun brr() = br.readLine().split(' ').map { it.toInt() }
fun list()= br.readLine().split(' ').map { it.toInt() }.toIntArray()

fun main() = with(System.out.bufferedWriter()){
    val (n, k)=brr()
    val dp = Array(31) { IntArray(31) }
    dp[1][1] =1
    dp[2][1] =1
    dp[2][2] =1
    for (i in 3 until n + 1) {
        for (j in 1 until i + 1) {
            if (j == 1 || j == i) {
                dp[i][j] = 1
            } else {
                dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j]
            }
        }
    }
    write("${dp[n][k]}")
    close()
}