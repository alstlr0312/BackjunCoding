import java.io.BufferedReader

val br = System.`in`.bufferedReader()

fun main() {
    val n = br.readLine().toInt()
    val k = br.readLine().toInt()
    val card = Array(n) { "" }
    for (i in 0 until n) {
        card[i] = br.readLine()
    }
    val visited = BooleanArray(n)
    checkCard(k, "", card, visited)

    val sb = StringBuilder()
    sb.append(set.size)
    sb.append("\n")

    println(sb.toString())
}

val set = HashSet<String>()

fun checkCard(count: Int, current: String, card: Array<String>, visited: BooleanArray) {
    if (count == 0) {
        set.add(current)
        return
    }
    for (i in card.indices) {
        if (!visited[i]) {
            visited[i] = true
            checkCard(count - 1, current + card[i], card, visited)
            visited[i] = false
        }
    }
}
