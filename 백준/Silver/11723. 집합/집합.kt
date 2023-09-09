import java.io.BufferedReader
import java.io.InputStreamReader
import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var arr = IntArray(21) { 0 }
    var m = br.readLine().toInt()

    for (i in 0 until m) {
        val x = br.readLine().split(" ")
        val X = x[0]
        when (X) {
            "add" -> {
                val x = x[1].toInt()
                if (arr[x] == 0) arr[x] = 1
            }
            "remove" -> {
                val x = x[1].toInt()
                if (arr[x] == 1) arr[x] = 0
            }
            "check" -> {
                val x = x[1].toInt()
                if (arr[x] == 0) bw.write("0\n") else bw.write("1\n")
            }
            "toggle" -> {
                val x = x[1].toInt()
                if (arr[x] == 1) arr[x] = 0 else arr[x] = 1
            }
            "all" -> arr.fill(1) //초기화

            "empty" -> arr.fill(0) //초기화
        }
    }
    bw.flush()
}