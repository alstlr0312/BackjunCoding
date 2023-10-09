import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var n = br.readLine().toInt()
    //n=2->5*5
    //n=3->9*9....1,5,9,13... 4씩 차이남
    //1+(4-1)=4n-3이 가로세로의 크기
    n = 4 * n - 3 // 가로 세로의 출력 크기
    val s= Array(n) { CharArray(n) { ' ' } } //별

    Star(0, n, s)

    for (i in 0 until n) {
        for (j in 0 until n) {
            bw.write(s[i][j].toString())
        }
        bw.newLine()
    }

    bw.flush()
}

fun Star(s: Int, len: Int, star: Array<CharArray>) {
    if (len <= s) return

    for (i in s until len) {
        star[s][i] = '*' // 맨 위 가로줄
        star[len - 1][i] = '*' // 맨 아래 가로줄
        star[i][s] = '*' // 왼쪽 세로줄
        star[i][len - 1] = '*' // 오른쪽 세로줄
    }

    // 별을 좌표라고 생각할 때 겉 테두리의 사각형과 가장 근접한 사각형을 보았을 때 2만큼의 차이가 납니다.
    Star(s + 2, len - 2, star)
}
