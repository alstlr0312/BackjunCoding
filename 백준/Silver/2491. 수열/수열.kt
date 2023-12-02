import java.math.BigInteger
import kotlin.math.max

val br = System.`in`.bufferedReader()
fun brr() = br.readLine().split(' ').map { it.toInt() }
fun list()= br.readLine().split(' ').map { it.toInt() }.toIntArray()

fun main() = with(System.out.bufferedWriter()){
    val n=br.readLine().toInt()
    val list = list()

    var big=1
    var small=1
    var result=1
   for(i in 0 until n-1){
       if(list[i]<=list[i+1]) big++
       else big=1
       result=Math.max(result,big)
   }
    for(i in 0 until n-1){
        if(list[i]>=list[i+1]) small++
        else small=1
        result=Math.max(result,small)
    }
    write("${result}")
    close()
}