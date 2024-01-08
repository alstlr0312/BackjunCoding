val br = System.`in`.bufferedReader()
fun brr() = br.readLine().split(' ').map { it.toInt() }
fun list()= br.readLine().split(" ".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
var n = 0
var result = 0
var result2 = 0
fun main() = with(System.out.bufferedWriter()) {
	val a = br.readLine()
	val b = br.readLine()
	var phone = ""
	for (i in 0 until a.length) {
		phone += a[i]
		phone += b[i]
	}
	while (phone.length > 2) {
		var P = ""
		for (i in 0 until phone.length - 1) {
			val n = Character.getNumericValue(phone[i]) + Character.getNumericValue(phone[i + 1])
			P += Integer.toString(n % 10)
		}
		phone = P
	}
	write("$phone")
	close()
}

