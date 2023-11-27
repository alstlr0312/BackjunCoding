import kotlin.system.exitProcess

val br = System.`in`.bufferedReader()
fun brr() = br.readLine().split(' ').map { it.toInt() }

fun main() = with(System.out.bufferedWriter()){
    val n = br.readLine()
    val list = IntArray(26)
    for (i in 0 until n.length) {
        val idx = n[i] - 'A'
        list[idx]++
    }

    var one = 0
    for (i in list.indices) {
        if (list[i] % 2 != 0) one++
    }

    var result = ""
    val sb = StringBuilder()
    if (one > 1) result += "I'm Sorry Hansoo"
    else {
        for (i in list.indices) {
            for (j in 0 until list[i] / 2) {
                sb.append((i + 65).toChar())
            }
        }
        result += sb.toString()
        val end = sb.reverse().toString()

        sb.setLength(0)
        for (i in list.indices) {
            if (list[i] % 2 == 1) {
                sb.append((i + 65).toChar())
            }
        }
        result += sb.toString() + end
    }
    write("$result")
    close()
}