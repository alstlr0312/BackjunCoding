import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    var st = StringTokenizer(br.readLine())
    val n = st.nextToken().toInt()
    val m = st.nextToken().toInt()
    val map = Array(n) { IntArray(m) }
    
    //직사각형을 입력 받음
    for (i in 0 until n) {
        val str = br.readLine()
        for (j in 0 until m) {
            map[i][j] = str[j] - '0'
        }
    }
    //정사각형을 만들어야 함으로 길이가 작은 것을 기준으로 함
    var length = Math.min(n, m)

    while (length > 1) {
        //만들 수 있는 가장 큰 정사각형부터 탐색을 시작한다.
        for (i in 0..n - length) {
            for (j in 0..m - length) {
                val num = map[i][j]
                //꼭짓점의 수가 같다면 출력
                if (num == map[i][j + length - 1] && num == map[i + length - 1][j] && num == map[i + length - 1][j + length - 1]) {
                    bw.write("${length * length}\n")
                    bw.flush()
                    return
                }
            }
        }
        //한바꾸 돌고 정사각형이 안나오면 크기를 줄여서 탐색
        length--
    }

    bw.write("${length * length}\n")
    bw.flush()

}