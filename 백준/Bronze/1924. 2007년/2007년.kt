val br = System.`in`.bufferedReader()
fun brr() = br.readLine().split(' ').map { it.toInt() }
fun list()= br.readLine().split(" ".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
var n = 0
var result = 0
fun main() = with(System.out.bufferedWriter()) {
	val (m,d)=brr()
	val days = arrayOf("MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN")
	val months = intArrayOf(0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)
	for (i in 0 until m) {
		result += months[i]
	}
	result += d - 1
	print(days[result % 7])
	close()
}

