import java.util.*
import kotlin.Comparator

val br = System.`in`.bufferedReader()

fun list() = br.readLine().split(" ".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
fun input() = br.readLine().split(" ")
fun brr() = br.readLine().split(' ').map { it.toInt() }

val dx = intArrayOf(1, -1, 0, 0, 1, -1, 1, -1)
val dy = intArrayOf(0, 0, -1, 1, 1, 1, -1, -1)
var result = 1
val visited = BooleanArray(10000)

fun main() = with(System.out.bufferedWriter()) {
    val (n,k,a,b) = brr()
    val deadtimer = IntArray(n) { k }
    var stop = false
    while(!stop){
        for(i in 0 until a){
            deadtimer[i]+=b
        }
        deadtimer.sort()
        for(i in 0 until n){
            deadtimer[i]-=1
            if(deadtimer[i]==0){
                write("$result")
                flush()
                return@with
            }
        }
        deadtimer.sort()
        result++
    }
    close()
}
