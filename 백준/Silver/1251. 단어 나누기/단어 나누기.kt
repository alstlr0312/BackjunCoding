import java.util.*


val br = System.`in`.bufferedReader()
fun brr() = br.readLine().split(' ').map { it.toInt() }
fun list()= br.readLine().split(" ".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()

var n = ""
var result: Long = 0
fun main() = with(System.out.bufferedWriter()) {
    n = br.readLine()
    val len = n.length
    val arr: MutableList<String> = ArrayList()
    for (a in 1 until len) {
        for (b in a + 1 until len) {
            arr.add(getWord(n, a, b))
        }
    }
    Collections.sort(arr)
    write(arr[0])
    close()
}

private fun getWord(s: String, a: Int, b: Int): String {
    val s1 = StringBuilder(s.substring(0, a))
    val s2 = StringBuilder(s.substring(a, b))
    val s3 = StringBuilder(s.substring(b))
    val sb = StringBuilder()
    sb.append(s1.reverse()).append(s2.reverse()).append(s3.reverse())
    return sb.toString()
}