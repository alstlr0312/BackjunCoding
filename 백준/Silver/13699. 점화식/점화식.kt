val br = System.`in`.bufferedReader()
fun brr() = br.readLine().split(' ').map { it.toInt() }
fun list()= br.readLine().split(' ').map { it.toInt() }.toIntArray()

fun main() = with(System.out.bufferedWriter()) {
    val n = br.readLine().toInt()
    val t = Array(n + 1) { 0L }
    t[0] = 1

    for (i in 1..n){
        for (k in 0 until i) {
            t[i] += t[k] * t[i - k - 1]
        }
    }
        
    write("${t[n]}")
    close()
}