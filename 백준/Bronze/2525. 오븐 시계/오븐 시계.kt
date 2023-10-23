import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val st1 = StringTokenizer(br.readLine())
    var a = Integer.parseInt(st1.nextToken())
    var b = Integer.parseInt(st1.nextToken())
    val c = Integer.parseInt(br.readLine())
    if(b+c>=60){
        a+=(b+c)/60
        if(a>=24){
            a-=24
        }
        b=(b+c)%60
    }else{
        b+=c
    }

    bw.write("${a} ${b}")
    bw.flush()
}

