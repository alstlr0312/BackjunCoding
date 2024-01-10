val br = System.`in`.bufferedReader()
fun brr() = br.readLine().split(' ').map { it.toInt() }
fun list()= br.readLine().split(" ".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
var n = 0
var result = 0
fun main() = with(System.out.bufferedWriter()) {
	val (a,b,c) = brr()
	if (a >= b) {
		if (a >= c) {
			if (b >= c)
				write("$b")
			else
				write("$c")
		} else
			write("$a")
	} else {
		if (c <= b) {
			if (c <= a)
				write("$a")
			else
				write("$c")
		} else
			write("$b")
	}
	close()
}

