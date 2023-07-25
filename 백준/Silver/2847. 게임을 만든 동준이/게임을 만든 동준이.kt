import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = br.readLine().toInt()
    val arr = IntArray(n)
    var result = 0
    for (i in 0 until n) {
        arr[i] = br.readLine().toInt()
    }
    for(i in n-2 downTo 0){
        if(arr[i]>=arr[i+1]){
            val c = arr[i]-arr[i+1]+1
            result+=c
            arr[i]-=c
        }
    }

    bw.write("${result}")
    bw.flush()
    bw.close()
}

