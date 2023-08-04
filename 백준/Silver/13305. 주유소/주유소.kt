import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = Integer.parseInt(br.readLine())
    val km = LongArray(n - 1)
    val oil = LongArray(n)
    var result: Long = 0

    val st = StringTokenizer(br.readLine(), " ")
    for (i in 0 until n - 1) {
        km[i] = st.nextToken().toLong()
    }
    
    val st2 = StringTokenizer(br.readLine(), " ")
    for (i in 0 until n) {
        oil[i] = st2.nextToken().toLong()
    }

    var cheap = oil[0] //지나온것중 젤 싼곳
    //젤 돈을 적게 쓸려면 도시마다 이동하면서 지나온 곳 중 젤 싼 곳의 기름을 채우면
    //즉 처음 기름을 넣곳보다 싼 주유소가 나오면 기름을 채우면된다.
    for (i in 0 until n - 1) {
        if (oil[i] < cheap) {
            cheap = oil[i]
        }

        result += cheap * km[i]
    }

    bw.write("$result")
    bw.flush()
    bw.close()
}




