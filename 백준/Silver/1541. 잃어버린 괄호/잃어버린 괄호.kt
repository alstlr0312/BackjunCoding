import java.util.*


val br = System.`in`.bufferedReader()
fun brr() = br.readLine().split(' ').map { it.toInt() }
fun list()= br.readLine().split(" ".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
var n = 0
var result = Int.MAX_VALUE.toLong()

fun main() = with(System.out.bufferedWriter()) {
	val st = StringTokenizer(br.readLine(), "-")
	while (st.hasMoreTokens()) {
		var temp = 0
		val str = StringTokenizer(st.nextToken(), "+")
		while (str.hasMoreTokens()) {
			temp += str.nextToken().toInt()
		}
		if (result == Int.MAX_VALUE.toLong()){
			result = temp.toLong()
		} else{
			result -= temp.toLong()
		}
	}
	write("$result")
	close()
}

