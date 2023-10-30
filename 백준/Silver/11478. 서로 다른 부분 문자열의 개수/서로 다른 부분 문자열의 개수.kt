import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.lang.StringBuilder
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = br.readLine()
    val set = HashSet<String>()
    for(i in 0 until n.length){
        for (j in i + 1..n.length){
            set.add(n.substring(i,j))
        }
    }
    bw.write("${set.size}")
    bw.flush()
}