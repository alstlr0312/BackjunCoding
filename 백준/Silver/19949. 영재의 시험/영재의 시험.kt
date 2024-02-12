import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*


val br = System.`in`.bufferedReader()

fun list() = br.readLine().split(" ").map { it.toInt() }.toMutableSet()
fun input() = br.readLine().split(" ")
fun brr() = br.readLine().split(' ').map { it.toInt() }
var result = 0
val answer = IntArray(10)
val choice = IntArray(10)
fun main() {
    val input = input()
    for (i in 0 until 10) {
        answer[i] = input[i].toInt()
    }
    dfs(0)
    println(result)
}

fun dfs(depth: Int) {
    if (depth == 10) {
        var correct = 0
        for (i in 0 until 10) {
            if (answer[i] == choice[i]) {
                correct++
            }
        }
        if (correct >= 5) {
            result++
        }
        return
    }

    for (i in 1..5) {
        if (depth > 1 && choice[depth - 1] == i && choice[depth - 2] == i) {
            continue
        }
        choice[depth] = i
        dfs(depth + 1)
        choice[depth] = 0
    }
}