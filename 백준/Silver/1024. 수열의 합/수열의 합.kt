import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val (N, L) = br.readLine().split(" ").map { it.toInt() }

    for (i in L..100) {
        val a = N - i * (i + 1) / 2
        if (a % i == 0) {
            val x = a / i + 1
            if (x >= 0) {
                for (len in 0 until i) {
                    print("${len + x} ")
                }
                println()
                return
            }
        }
    }

    println("-1")
}
