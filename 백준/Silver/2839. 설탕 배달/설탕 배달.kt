import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    var count = 0
    var n = br.readLine().toInt()
    while(true){
        if(n%5 == 0){
            bw.write("${n/5+count}")
            break
        } else if( n <= 0){
            bw.write("-1")
            break
        }
        n-=3
        count++
    }
    bw.flush()
}
