import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = br.readLine().toInt()

    val hashMap = HashMap<Int, Int>()
    val keys = br.readLine().split(" ").map { it.toInt() }.take(n)
    for(key in keys){
        if (hashMap.containsKey(key)) {
            val value = hashMap[key]!!
            hashMap[key] = value + 1
        } else {
            hashMap[key] = 1
        }
    }
    val m = br.readLine().toInt()
    val result = mutableListOf<Int>()
    val checks = br.readLine().split(" ").map { it.toInt() }.take(m)
    for(i in 0 until m){
        val checknum = checks[i]
        if (hashMap.containsKey(checknum)) {
            val value = hashMap[checknum]!!
            result.add(value)
        } else {
            result.add(0)
        }
    }
    bw.write("${result.joinToString(separator = " ")}")
    bw.flush()
}
