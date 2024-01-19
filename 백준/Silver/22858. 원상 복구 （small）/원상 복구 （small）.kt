val br = System.`in`.bufferedReader()
fun list()= br.readLine().split(" ".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
fun input() = br.readLine().split(" ")
fun brr() = br.readLine().split(' ').map { it.toInt() }
val dx = intArrayOf(1, -1, 0, 0, 1, -1, 1, -1)
val dy = intArrayOf(0, 0, -1, 1, 1, 1, -1, -1)

var result=0
fun main() = with(System.out.bufferedWriter()) {
    val(n,m) = brr()
    val S = IntArray(n + 1) //섞은 후
    val D = IntArray(n + 1) //원래의 위치

    val s = input()
    for (i in 1..n) {
        S[i] = s[i - 1].toInt()
    }

    val k = input()
    for (i in 1..n) {
        D[i] = k[i - 1].toInt()
    }
    for (i in 0 until m) {
        shuffle(S, D)
    }
    for (i in 1..n) {
        write("${S[i]} ")
    }
    close()
}

private fun shuffle(S: IntArray, D: IntArray) {
    val temp = IntArray(S.size)

    for (i in S.indices) {
        temp[D[i]] = S[i]
    }
    for (i in S.indices) {
        S[i] = temp[i]
    }
}