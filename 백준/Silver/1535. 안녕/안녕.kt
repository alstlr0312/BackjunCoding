import java.util.*
import javax.swing.text.html.HTML.Attribute.N





val br = System.`in`.bufferedReader()

fun list() = br.readLine().split(" ".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
fun input() = br.readLine().split(" ")
fun brr() = br.readLine().split(' ').map { it.toInt() }
private var n = 0
private lateinit var arr : Array<Int>
private lateinit var visit : Array<Boolean>
private lateinit var minus : Array<Int>
var result = Integer.MIN_VALUE
fun main() = with(System.out.bufferedWriter()) {
    val n = br.readLine().toInt()
    val dp = IntArray(100)
    val hp = IntArray(n + 1)
    val joy = IntArray(n + 1)

    val st = StringTokenizer(br.readLine())
    for (i in 0 until n) {
        hp[i] = st.nextToken().toInt()
    }

    val st2 = StringTokenizer(br.readLine())
    for (i in 0 until n) {
        joy[i] = st2.nextToken().toInt()
    }

    for (i in 0 until n) {
        for (j in 99 downTo hp[i]) {
            dp[j] = Math.max(dp[j - hp[i]] + joy[i], dp[j])
        }
    }
    write("${dp[99]}")
    close()
}