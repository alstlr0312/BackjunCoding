import java.util.*
import kotlin.system.exitProcess

val br = System.`in`.bufferedReader()
fun brr() = br.readLine().split(' ').map { it.toInt() }

fun main() = with(System.out.bufferedWriter()){
    var n=br.readLine().toInt()
    var result=0
    while(n > 0){
        if(n%5 == 0){
            result += n /5
            break
        }
        else {
            n -= 2
            result += 1
        }
    }
    if(n>=0) result else result = -1
    write("$result")
    close()
}