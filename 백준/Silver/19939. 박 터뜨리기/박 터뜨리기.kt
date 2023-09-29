import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    var st = StringTokenizer(br.readLine())
    val n = st.nextToken().toInt()
    val k = st.nextToken().toInt()
    var sum = 0
    //1,2,3,4...는 기본적으로 성립해야하기에 바구니에 기본 공을 넣어준다.
    //조건 1,2,3을 성립
    for (i in 1..k) {
        sum += i
    }
    //주어진 공에서 기본공을 뺀다.
    var m = n - sum
    //0보다 적으면 조건을 성립 못한 것
    if (m < 0) {
        bw.write("-1")
    } else {
        //연속적일때
        if (m % k == 0) {
            val result = k-1
            bw.write("$result")
        }
        //비연속적일때
        else if (m % k != 0) {
            bw.write("$k")
        }
    }
    bw.flush()
}