import java.util.*


val br = System.`in`.bufferedReader()

fun list() = br.readLine().split(" ".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
fun input() = br.readLine().split(" ")
fun brr() = br.readLine().split(' ').map { it.toInt() }
var result = 0
fun main() = with(System.out.bufferedWriter()) {
    val (n,m)=brr()
    val load = IntArray(n)
    var result = 0
    var visit = false

    val getload = br.readLine().split(' ').map { it.toInt() }
    for (i in 0 until n) {
        load[i] = getload[i]
        if (load[i] == 1 && !visit) {
            result++
            visit = true
        } else if (load[i] == 0) {
            visit = false
        }
    }

    val sb = StringBuilder()

    for (i in 0 until m) {
        val command = br.readLine().split(' ').map { it.toInt() }
        if (command[0] == 0) {
            sb.append("$result\n")
        } else {
            val index = command[1] - 1
            if (load[index] == 1) continue
            else load[index] = 1

            when (index) {
                0 -> {
                    if (load[index + 1] == 0) result++
                }
                n - 1 -> {
                    if (load[index - 1] == 0) result++
                }
                else -> {
                    if (load[index - 1] == 0 && load[index + 1] == 0) {
                        result++
                    } else if (load[index - 1] == 1 && load[index + 1] == 1) {
                        result--
                    }
                }
            }
        }
    }
    println(sb.toString())
}