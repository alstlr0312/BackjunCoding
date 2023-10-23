import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val t = br.readLine().toInt()
    val sb = StringBuilder()
    repeat(t){
        val st=StringTokenizer(br.readLine())
        var a = Integer.parseInt(st.nextToken())
        var b = Integer.parseInt(st.nextToken())
        sb.append("${a + b} ")
    }
    bw.write(sb.toString())
    bw.flush()
}

