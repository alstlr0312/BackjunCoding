import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))

    while (true) {
        val line = br.readLine() ?: break
        val n = line.toInt()
        var answer = "-"

        repeat(n) {
            answer = sol(answer)
        }

        println(answer)
    }
    br.close()
}

fun sol(s: String): String {
    return s + " ".repeat(s.length) + s
}
