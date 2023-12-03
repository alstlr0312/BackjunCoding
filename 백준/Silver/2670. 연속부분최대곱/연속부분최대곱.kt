val br = System.`in`.bufferedReader()
fun brr() = br.readLine().split(' ').map { it.toInt() }
fun list()= br.readLine().split(' ').map { it.toInt() }.toIntArray()

fun main() = with(System.out.bufferedWriter()){
    val n=br.readLine().toInt()
    val arr = DoubleArray(n+1)
    val dp = DoubleArray(n+1)
    var max = 0.0
    for (i in 1..n) {
        arr[i] = br.readLine().toDouble()
        dp[i] = maxOf(arr[i], dp[i-1] * arr[i])
        max = maxOf(max, dp[i])
    }
    write("%.3f".format(max))
    close()
}