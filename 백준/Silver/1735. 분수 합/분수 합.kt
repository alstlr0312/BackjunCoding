import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.lang.StringBuilder
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val (a1, a2) = br.readLine().split(" ").map { it.toInt() }
    val (b1, b2) = br.readLine().split(" ").map { it.toInt() }
    val a = a1*b2+b1*a2
    val b = a2*b2
    val gcd = getGcd(a,b)
    bw.write("${a/gcd} ${b/gcd}\n")
    bw.flush()
}

fun getGcd(a:Int,b:Int): Int {
    if(a%b==0){
        return b
    }
    return getGcd(b,a%b)
}