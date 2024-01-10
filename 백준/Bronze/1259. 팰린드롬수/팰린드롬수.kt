val br = System.`in`.bufferedReader()
fun brr() = br.readLine().split(' ').map { it.toInt() }
fun list()= br.readLine().split(" ".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
var n = 0
var result = 0
fun main() = with(System.out.bufferedWriter()) {
	while (true) {
		val n = br.readLine()
		val sb = StringBuilder(n)
		val f = sb.reverse().toString()
		if (n == "0") break
		if (n == f) {
			println("yes")
		} else {
			println("no")
		}
	}
	close()
}

