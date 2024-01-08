
import java.util.*


val br = System.`in`.bufferedReader()
fun brr() = br.readLine().split(' ').map { it.toInt() }
fun list()= br.readLine().split(" ".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
var n = 0
var result = 0
fun main() = with(System.out.bufferedWriter()) {
	var n = br.readLine().toInt()
	val st = StringTokenizer(br.readLine())
	var min = Int.MAX_VALUE
	while (n-- > 0) {
		val money = st.nextToken().toInt()
		result = Math.max(result, money - min)
		min = Math.min(min, money)
	}
	write("$result")
	close()
}

