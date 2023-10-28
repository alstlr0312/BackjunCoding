import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    var n = br.readLine().toInt()
    var count = 0
    val st = StringTokenizer(br.readLine())
    val arr = IntArray(n) { st.nextToken().toInt() }
    val sortedarr = arr.clone()
    sortedarr.sort()
    val map: HashMap<Int, Int> = HashMap()
    sortedarr.forEach {
        if (!map.containsKey(it)) {
            //맵의 it의 key에 count 할당
            map[it] = count
            count++
        }
    }
    val sb = StringBuilder()
    for (key in arr) {
        val ranking = map[key]
        sb.append(ranking).append(' ')
    }
    bw.write("${sb}")
    bw.flush()
}
