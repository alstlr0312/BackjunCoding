import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val st = StringTokenizer(br.readLine())
    var result = 0
    val numbers = mutableListOf<Int>()
    while (st.hasMoreTokens()) {
        numbers.add(Integer.parseInt(st.nextToken()))
    }
    numbers.sortDescending()
    val a = numbers[0]
    val b = numbers[1]
    val c = numbers[2]
    if(a == b && b == c){
        result=10000+a*1000
    }else if( a!=b && b!=c){
        result=a*100
    }else {
        val samenum: Int = if (a == b) { a } else { c }
        result = 1000 + samenum * 100
    }

    bw.write("${result}")
    bw.flush()
}

