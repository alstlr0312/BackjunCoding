import java.util.*


val br = System.`in`.bufferedReader()

fun list() = br.readLine().split(" ").map { it.toInt() }.toMutableSet()
fun input() = br.readLine().split(" ")
fun brr() = br.readLine().split(' ').map { it.toInt() }

fun main() {
    val stack = Stack<Project>()
    var score = 0
    val n = br.readLine().toInt()
    repeat(n) {
        StringTokenizer(br.readLine()).apply {
            when (nextToken()) {
                "0" -> if (stack.isNotEmpty()) stack.peek().time--
                "1" -> stack.push(Project(nextToken().toInt(), nextToken().toInt() - 1))
            }
        }
        if (stack.isNotEmpty() && stack.peek().time == 0) {
            score += stack.pop().score
        }
    }
    println(score)
}

class Project(val score: Int, var time: Int)
