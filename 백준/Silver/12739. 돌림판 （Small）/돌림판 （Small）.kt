import java.util.*
import javax.swing.text.html.HTML.Attribute.N


val br = System.`in`.bufferedReader()

fun list() = br.readLine().split(" ").map { it.toInt() }.toMutableSet()
fun input() = br.readLine().split(" ")
fun brr() = br.readLine().split(' ').map { it.toInt() }

data class RGB(var r: Int = 0, var g: Int = 0, var b: Int = 0)

fun main() {
    val (n,k)=brr()
    var str = br.readLine()

    repeat(k) {
        var tmp = ""

        for (i in str.indices) {
            if ((str[f(i - 1, str)] == str[i] && str[i] == str[f(i + 1, str)])
                || (str[f(i - 1, str)] != str[i] && str[i] != str[f(i + 1, str)] && str[f(i - 1, str)] != str[f(i + 1, str)])
            ) {
                tmp += "B"
            } else {
                val rgb = RGB()
                for (j in -1..1) {
                    func(rgb, str[f(i + j, str)])
                }

                if ((rgb.r == 2 && rgb.g == 1) || (rgb.g == 2 && rgb.b == 1) || (rgb.b == 2 && rgb.r == 1)) {
                    tmp += "R"
                } else {
                    tmp += "G"
                }
            }
        }

        str = tmp
    }

    val rgb = RGB()
    for (i in str) {
        func(rgb, i)
    }

    println("${rgb.r} ${rgb.g} ${rgb.b}")
}

fun f(idx: Int, str: String): Int {
    if (idx <= -1)
        return str.length + idx
    if (idx >= str.length)
        return idx % str.length
    return idx
}

fun func(rgb: RGB, c: Char) {
    when (c) {
        'R' -> rgb.r++
        'G' -> rgb.g++
        'B' -> rgb.b++
    }
}