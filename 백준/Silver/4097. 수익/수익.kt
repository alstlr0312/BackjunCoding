import java.util.*

val br = System.`in`.bufferedReader()

fun list() = br.readLine().split(" ").map { it.toInt() }.toMutableSet()
fun input() = br.readLine().split(" ")
fun brr() = br.readLine().split(' ').map { it.toInt() }

fun main() {
    while(true){
        val n = br.readLine().toInt()
        if(n == 0) break
        val input = IntArray(n){ br.readLine().toInt() }
        val dp = IntArray(n+1)
        var sum = 0
        var result = Int.MIN_VALUE
        for(i in 0 until n){
            sum+=input[i]
            result=Math.max(result,sum)
            if(sum<0) sum=0
        }
        println(result)
    }
}



