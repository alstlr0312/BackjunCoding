import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer
import kotlin.math.max

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))

    val (n,m) = br.readLine().split(" ").map{it.toInt()}
    val list = IntArray(n+1)
    val st=StringTokenizer(br.readLine()," ")
    val sb=StringBuilder()
    for(i in 1..n){
        list[i]=list[i-1]+st.nextToken().toInt()
    }
    repeat(m){
        val(start,end)= br.readLine().split(" ").map{it.toInt()}
       sb.append(list[end]-list[start-1]).append('\n')
    }
    println(sb)

}