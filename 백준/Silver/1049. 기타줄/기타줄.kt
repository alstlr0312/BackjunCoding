import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val st = StringTokenizer(br.readLine())

    val n = st.nextToken().toInt()
    val m = st.nextToken().toInt()
    var result = Int.MAX_VALUE

    val one = IntArray(m)
    val all = IntArray(m)
    for(i in 0 until m) {
        val st2 = StringTokenizer(br.readLine())
        all[i] = st2.nextToken().toInt()
        one[i] = st2.nextToken().toInt()
    }
    one.sort()
    all.sort()

    result = Math.min(((n/6)+1)*all[0], n*one[0])
    result = Math.min(result, ((n/6))*all[0] + (n%6)*one[0])

    println(result)
}