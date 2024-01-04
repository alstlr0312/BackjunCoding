import java.util.*


val br = System.`in`.bufferedReader()
fun brr() = br.readLine().split(' ').map { it.toInt() }
fun list()= br.readLine().split(" ".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
var n = 0
var result = Int.MAX_VALUE.toLong()

fun main() = with(System.out.bufferedWriter()) {
	val t = br.readLine().toInt()
	var dp = IntArray(11)
	dp[1] = 1
	dp[2] = 2
	dp[3] = 4
	for (j in 4..10) {
		dp[j] = dp[j - 3] + dp[j - 2] + dp[j - 1]
	}
	for (i in 0 until t) {
		val n = br.readLine().toInt()
		write("${dp[n]}\n")
	}
	close()
}


