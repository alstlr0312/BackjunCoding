import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*
fun main() {

    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = System.out.bufferedWriter()
    var st = StringTokenizer(br.readLine())
    val n = st.nextToken().toInt()
    val new = st.nextToken().toInt()
    val p = st.nextToken().toInt()
    var result = -1

    var num = 0
    //리스트가 이미 있을 떄
    if (n > 0) {
        st = StringTokenizer(br.readLine())
        for (i in 1..n) {
            num = st.nextToken().toInt()
            if (result < 0 && new >= num) {
                result = i
            }
        }
    }
    //꼴찌일때
    if (result < 0 && n < p) result = n + 1
    //랭킹에 못올라갊
    else if (n == p && num == new) result = -1
    bw.write("$result\n")
    bw.flush()
}