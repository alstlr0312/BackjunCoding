import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val sb = StringBuilder()
    val n = br.readLine().toInt()
    val result = n/4
    for(i in 0 until  result){
        sb.append("long ")
    }
    sb.append("int")
    bw.write("${sb} ")
    bw.flush()
}

