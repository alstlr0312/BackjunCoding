import java.util.*

val br = System.`in`.bufferedReader()
fun brr() = br.readLine().split(' ').map { it.toInt() }
fun list()= br.readLine().split(" ".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
var n = 0
var result = Int.MAX_VALUE.toLong()

fun main() = with(System.out.bufferedWriter()) {
	val (n,k) = brr()
	val a = Array(n + 1) { IntArray(2) }
	var dp = Array(n + 1) { IntArray(k + 1) }
	var w = IntArray(n + 1)
	var v = IntArray(n + 1)

	for (i in 1..n) {
		val st = StringTokenizer(br.readLine())
		w[i] = st.nextToken().toInt()
		v[i] = st.nextToken().toInt()
	}

	for (i in 1..n) {
		for (j in 1..k) {
			dp[i][j] = dp[i - 1][j]
			if (j - w[i] >= 0) {
				dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - w[i]] + v[i])
			}
		}
	}


	write("${dp[n][k]}")
	close()
}


