val br = System.`in`.bufferedReader()
fun brr() = br.readLine().split(' ').map { it.toInt() }
fun list()= br.readLine().split(" ".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
var n = 0
var result = 0
fun main() = with(System.out.bufferedWriter()) {
	val n = br.readLine().toInt()
	var money = 1000-n
	val coin = intArrayOf(500, 100, 50, 10, 5, 1)
	var i = 0
	while (money != 0) {
		if (money - coin[i] >= 0) {
			money -= coin[i]
			result++
		} else {
			i++
		}
	}
	write("$result")
	close()
}

