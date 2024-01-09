import java.util.*
import javax.swing.text.html.HTML.Attribute.N


val br = System.`in`.bufferedReader()
fun brr() = br.readLine().split(' ').map { it.toInt() }
fun list()= br.readLine().split(" ".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
var n = 0
var result = 0
fun main() = with(System.out.bufferedWriter()) {
	var n = br.readLine().toInt()
	var st: StringTokenizer
	val A = IntArray(n)
	st = StringTokenizer(br.readLine())
	for (i in 0 until n) {
		A[i] = st.nextToken().toInt()
	}
	A.sort()

	val B= IntArray(n)
	st = StringTokenizer(br.readLine())
	for (i in 0 until n) {
		B[i] = st.nextToken().toInt()
	}
	B.sortDescending()

	for (i in 0 until n) {
		result += A[i] * B[i]
	}
	write("$result")
	close()
}

