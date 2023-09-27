import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = br.readLine().toInt()
    val map = Array(101) { CharArray(101) }
    var hor = 0
    var ver= 0
    for (i in 0 until n) {
        val s = br.readLine()
        for (j in 0 until n) {
            map[i][j] = s[j]
        }
    }
    // 누울 자리 확인
    for (i in 0 until n) {
        var checkH = 0
        var checkV = 0
        for (j in 0 until n) {
            // 가로 체크
            if (map[i][j] == '.') checkH++//.이 나올때마다++
            if (map[i][j] == 'X' || j == n - 1) { //X가 나왔거나 가로줄 마지막일때
                if (checkH >= 2) hor++
                checkH = 0//다음줄을 위해서 초기화
            }

            // 세로 체크
            if (map[j][i] == '.') checkV++
            if (map[j][i] == 'X' || j == n - 1) { //X가 나왔거나 세로줄 마지막일때
                if (checkV >= 2) ver++
                checkV = 0
            }
        }
    }
    bw.write("$hor $ver")
    bw.flush()
}
