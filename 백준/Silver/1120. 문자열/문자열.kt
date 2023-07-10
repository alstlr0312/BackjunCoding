import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val (a, b) = br.readLine().split(" ")
    var result = a.length
    for(i in 0 until b.length-a.length+1){
        var c = 0
        for (j in a.indices)
            if (a[j] != b[j + i]) {
                c++
            }
        if(result>c){
            result = c
        }
    }
    println(result)

}