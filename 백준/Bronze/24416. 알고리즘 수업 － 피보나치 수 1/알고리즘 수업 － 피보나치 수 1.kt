val br = System.`in`.bufferedReader()
fun brr() = br.readLine().split(' ').map { it.toInt() }
fun list()= br.readLine().split(" ".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
var n = 0
var result = 0
var result2 = 0
fun main() = with(System.out.bufferedWriter()) {
	var n = br.readLine().toInt()
	fibo(n)
	fibonacci(n)
	write("${result}\n")
	write("${result2}\n")
	close()
}

fun fibo(n: Int): Int {
	if (n == 1 || n == 2) {
		result++
		return 1
	} else {
		return fibo(n - 1) + fibo(n - 2)
	}
}
fun fibonacci(n: Int): Int {
	val f = IntArray(n + 1)
	f[1] = 1
	f[2] = 1
	for (i in 3..n) {
		result2++
		f[i] = f[i - 1] + f[i - 2]
	}
	return f[n]
}



