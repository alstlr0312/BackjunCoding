import java.io.BufferedReader
import java.io.InputStreamReader
import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*
fun main() {
    val sc = Scanner(System.`in`)
    val str = sc.nextLine()
    val n = str.split(" ")[0].toInt()
    val Map = LinkedHashMap<Int, Int>()//수열

    for (i in 0 until n) {
        val a1 = sc.nextInt()
        Map[a1] = Map.getOrDefault(a1, 0) + 1
    }

    val sMap = Map.entries.sortedWith(
            compareByDescending<Map.Entry<Int, Int>> { it.value }
                    .thenBy { Map.keys.indexOf(it.key) }
    )


    val bw = System.out.bufferedWriter()
    for (a in sMap) {
        for (i in 0 until a.value) {
            bw.write("${a.key} ")
        }
    }

    bw.flush()
}