val br = System.`in`.bufferedReader()
fun brr() = br.readLine().split(' ').map { it.toInt() }
fun list()= br.readLine().split(" ".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
var n = 0
var result = 0
val check="true"
fun main() = with(System.out.bufferedWriter()) {
	val n = br.readLine()!!.replace("XXXX", "AAAA").replace("XX", "BB")
	write("${if ('X' in n) -1 else n}")
	close()
}

