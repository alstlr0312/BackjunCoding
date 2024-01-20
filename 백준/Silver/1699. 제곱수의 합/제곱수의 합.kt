val br = System.`in`.bufferedReader()
fun list()= br.readLine().split(" ".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
fun input() = br.readLine().split(" ")
fun brr() = br.readLine().split(' ').map { it.toInt() }
val dx = intArrayOf(1, -1, 0, 0, 1, -1, 1, -1)
val dy = intArrayOf(0, 0, -1, 1, 1, 1, -1, -1)
fun main() = with(System.out.bufferedWriter()) {
    val n = br.readLine().toInt()
    val result= IntArray(n+1)
    for (i in 0..n) {
        result[i] = i
    }
    for (i in 2..n) {
        var min = 100001
        for (j in 1..i / 2) {
            if (j * j == i) {
                min = 1
                break
            } else {
                min = Math.min(min, result[j] + result[i - j])
            }
        }
        result[i] = min
    }
    write("${result[n]}")
    close()
}