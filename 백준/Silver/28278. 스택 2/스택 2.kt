import java.io.BufferedReader
import java.io.InputStreamReader
import java.lang.StringBuilder
import java.util.*

fun main() {
    val stack = Stack<Int>()
    val sb = StringBuilder()

    val br = BufferedReader(InputStreamReader(System.`in`))
    val N = br.readLine().toInt() 

    repeat(N) {
        solution(br.readLine(), stack, sb)
    }

    br.close()

    println(sb)
}

fun solution(query: String, stack: Stack<Int>, sb: StringBuilder) {
    val c = query[0]

    when (c) {
        '1' -> {
            stack.push(query.substring(2).toInt())
        }
        '2' -> {
            sb.append(if (stack.isEmpty()) -1 else stack.pop()).append("\n")
        }
        '3' -> {
            sb.append(stack.size).append("\n")
        }
        '4' -> {
            sb.append(if (stack.isEmpty()) 1 else 0).append("\n")
        }
        '5' -> {
            sb.append(if (stack.isEmpty()) -1 else stack.peek()).append("\n")
        }
        else -> {
        }
    }
}
