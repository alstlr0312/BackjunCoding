import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = br.readLine().toInt()

    var sum = 0 //분자 분모 합
    var i = 0     //같은 분자 분모 합에서 가장 뒤
    while (sum + i < n) {
        i += sum++
    }

    var a = if (sum % 2 == 0) n - i else sum + 1 - (n - i)
    var b = sum + 1 - a


    bw.write("$a/$b")
    bw.flush()
}
