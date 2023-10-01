import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val card = LongArray(n)

    for (i in 0 until n) {
        card[i] = br.readLine().toLong()
    }

    card.sort()

    var cnt = 1
    var max = 0
    var index = 0

    for (i in 0 until n - 1) {
        if (card[i] == card[i + 1]) {
            cnt++
            if (cnt > max) {
                max = cnt
                index = i
            }
        } else {
            cnt = 1
        }
    }

    bw.write("${card[index]}\n")

    bw.flush()
}
