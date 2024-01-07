val br = System.`in`.bufferedReader()
fun brr() = br.readLine().split(' ').map { it.toInt() }
fun list()= br.readLine().split(" ".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
var n = 0
var result = 0

fun main() = with(System.out.bufferedWriter()) {
	var n = br.readLine().toInt()
	val f = br.readLine().toInt()
	n /= 100
	n *= 100
	while (n % f != 0) {
		n++
		result++
	}
	if (result < 10) {
		write("0$result")
	} else {
		write("$result")
	}
	close()
}



