import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = br.readLine().toInt()
    var result = 0
    repeat(n) {
        val stack = Stack<Char>()
        val word = br.readLine()

        for (i in 0 until word.length) {
            if (stack.isEmpty()) {
                stack.push(word[i])
            } else {
                if (stack.peek() == word[i]) {
                    stack.pop()
                } else {
                    stack.push(word[i])
                }
            }
        }

        if (stack.isEmpty()) {
            result++
        }
    }

    bw.write(result.toString())
    bw.flush()
}
