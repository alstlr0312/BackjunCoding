import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.lang.StringBuilder
import java.util.StringTokenizer
import kotlin.math.sqrt

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    //미리 소수 저장
    val prime = mutableListOf<Int>()
    val check = BooleanArray(1000001)
    check[0] = true
    check[1] = true
    for (i in 2..1000000) {
        if (!check[i]) {
            prime.add(i)
            var j = 2 * i
            while (j <= 1000000) {
                check[j] = true
                j += i
            }
        }
    }

    val n = br.readLine().toInt()
    repeat(n){
        var count = 0
        var num = br.readLine().toInt()
        for (i in prime) {
            if (i >= num) {
                break
            }
            if (!check[num - i] && i <= num - i) {
                count++
            }
        }
        bw.write("${count}\n")
    }
    bw.flush()
}
