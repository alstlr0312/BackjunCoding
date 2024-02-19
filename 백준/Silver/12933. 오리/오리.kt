import java.io.BufferedReader
import java.io.InputStreamReader
import java.math.BigInteger
import java.util.*
import kotlin.math.floor
import kotlin.math.max


val br = System.`in`.bufferedReader()

fun list() = br.readLine().split(" ").map { it.toInt() }.toMutableSet()
fun input() = br.readLine().split(" ")
fun brr() = br.readLine().split(' ').map { it.toInt() }

fun main() {
    val str = br.readLine()
    val checkquack = BooleanArray(2501)
    var ans = 0

    for (i in str.indices) {
        var temp = ""
        var valid = false
        val index = IntArray(5)
        for (j in i until str.length) {
            if (!checkquack[j]) {
                when {
                    str[j] == 'q' && temp == "" -> {
                        index[0] = j
                        temp += 'q'
                    }
                    str[j] == 'u' && temp == "q" -> {
                        index[1] = j
                        temp += 'u'
                    }
                    str[j] == 'a' && temp == "qu" -> {
                        index[2] = j
                        temp += 'a'
                    }
                    str[j] == 'c' && temp == "qua" -> {
                        index[3] = j
                        temp += 'c'
                    }
                    str[j] == 'k' && temp == "quac" -> {
                        index[4] = j
                        temp += 'k'
                    }
                }
            }

            if (temp == "quack") {
                temp = ""
                if (!valid) {
                    valid = true
                    ans++
                }
                checkquack[index[0]] = true
                checkquack[index[1]] = true
                checkquack[index[2]] = true
                checkquack[index[3]] = true
                checkquack[index[4]] = true

            }
        }
    }

    for (i in str.indices) {
        if (!checkquack[i]) {
            println(-1)
            return
        }
    }

    println(ans)
}