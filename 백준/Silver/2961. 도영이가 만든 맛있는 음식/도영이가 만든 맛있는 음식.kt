import java.util.*
import javax.swing.text.html.HTML.Attribute.N
import javax.swing.text.html.HTML.Tag.S


val br = System.`in`.bufferedReader()

fun list() = br.readLine().split(" ").map { it.toInt() }.toMutableSet()
fun input() = br.readLine().split(" ")
fun brr() = br.readLine().split(' ').map { it.toInt() }

var city = 0
val cost = Array(10){ IntArray(10) }
val visited = BooleanArray(10)
var result = Int.MAX_VALUE

fun main() = with(System.out.bufferedWriter()) {
    val n = br.readLine().toInt()
    val sour = IntArray(n+1)
    val bit = IntArray(n+1)
    for (i in 0 until n) {
        val (s, b) = br.readLine().split(" ").map { it.toInt() }
        sour[i]=s
        bit[i]=b
    }
    
    fun dfs(depth: Int, s: Int, b: Int, count: Int) {
        if (depth == n) {
            if (count != 0 && Math.abs(s - b) < result)
                result = Math.abs(s - b)
            return
        }
        dfs(depth + 1, s * sour[depth], b + bit[depth], count + 1)
        dfs(depth + 1,s,b, count)
    }

    dfs(0,1,0,0)
    write("${result}")
    close()
}

