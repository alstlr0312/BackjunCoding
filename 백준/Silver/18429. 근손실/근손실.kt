val br = System.`in`.bufferedReader()
fun brr() = br.readLine().split(' ').map { it.toInt() }
fun list()= br.readLine().split(" ".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
var result = 0
var day=0
lateinit var arr: IntArray
lateinit var visit: BooleanArray
fun main() = with(System.out.bufferedWriter()) {
	val(n,k)=brr()
	arr = brr().toIntArray()
	visit = BooleanArray(n)
	muscle(500,k,arr)
	write("$result")
	close()
}

fun muscle(w: Int, k: Int, ex: IntArray) {
	if (w < 500) {
		return
	}
	if (day == ex.size) {
		result++
		return
	}
	for (i in ex.indices) {
		if (!visit[i]) {
			visit[i] = true
			val newWeight = w - k + ex[i]
			day += 1
			muscle(newWeight, k, ex)
			visit[i] = false
			day -= 1
		}
	}
}

