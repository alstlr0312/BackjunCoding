
val br = System.`in`.bufferedReader()
fun list()= br.readLine().split(" ".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
fun input() = br.readLine().split(" ")
fun brr() = br.readLine().split(' ').map { it.toInt() }
val dx = intArrayOf(1, -1, 0, 0, 1, -1, 1, -1)
val dy = intArrayOf(0, 0, -1, 1, 1, 1, -1, -1)
var result = 0

fun main() = with(System.out.bufferedWriter()) {
    val t = br.readLine().toInt()
    val sum=LongArray(1000001)
    sum[1]=1
    sum[2]=2
    sum[3]=4
    for (i in 4..1000000) {
        sum[i] = (sum[i - 1] + sum[i - 2] + sum[i - 3]) % 1000000009
    }
    for (i in 0 until t) {
        val n = br.readLine().toInt()
        write("${sum[n]}\n")
    }

    
    close()
}



