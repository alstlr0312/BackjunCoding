import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = br.readLine().toInt()

    val hashMap = HashMap<String, String>()
    for(i in 0..n-1){
        val (key, value) = br.readLine().split(" ").map { it }
        hashMap[key] = value
    }
    val remove = mutableListOf<String>()
    for(i in hashMap.keys){
        if(hashMap[i] == "leave"){
            remove.add(i)
        }
    }
    for(i in remove){
        hashMap.remove(i)
    }
    val result = hashMap.keys.sortedDescending().joinToString(" ")
    bw.write("${result}")
    bw.flush()
}
