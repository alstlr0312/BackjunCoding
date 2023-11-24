import java.io.*
import java.util.*
val br = System.`in`.bufferedReader()
fun brr() = br.readLine().split(' ').map { it.toInt() }

fun main() = with(System.out.bufferedWriter()){
    val a=br.readLine().toInt()
    val b=br.readLine().toInt()
    write("${a+b}")
    close()
}