import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()
    val st = StringTokenizer(br.readLine())
    val list = mutableListOf<Int>()
    repeat(n) {
        list.add(st.nextToken().toInt())
    }
    var check = false
    for (i in n - 1 downTo 1) {
        if (list[i - 1] > list[i]) {
            var a = i
            for (j in n - 1 downTo i) {
                if (list[i - 1] > list[j] && list[j] > list[a]) {
                    a = j
                }
            }
            val temp = list[a]
            list[a] = list[i - 1]
            list[i - 1] = temp
            list.subList(i, n).sortByDescending { it }
            check = true
            break
        }
    }
    if (check) {
        list.joinToString(" ").also { println(it) }
    } else {
        println("-1")
    }
}
