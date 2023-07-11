import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val n = reader.readLine().toInt()
    val p = reader.readLine().split(" ").map { it.toInt() }.toIntArray()
    val result = IntArray(n)
    for (i in 0 until n) {
        for (j in 0 until i) {
            if (p[j] > p[i]) {
                result[j]++
            } else if (p[j] <= p[i]) {
                result[i]++
            }
        }
    }
    for (idx in 0 until n) {
        print("${result[idx]} ")
    }
}