import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val st = StringTokenizer(br.readLine())
    val n = st.nextToken().toInt()
    val m = st.nextToken().toInt()
    val Poken = HashMap<String, Int>()
    val APoke = arrayOfNulls<String>(n + 1)
    val sb = StringBuilder()

    for (i in 1..n) {
        val name = br.readLine()
        Poken[name] = i
        APoke[i] = name
    }

    // 결과 처리
    repeat(m) {
        val findStr = br.readLine()
        if (CkeckNum(findStr)) {
            val index = findStr.toInt()
            sb.append(APoke[index])
        } else {
            sb.append(Poken[findStr])
        }
        sb.append("\n")
    }

    println(sb.toString())
}

//숫잔지 이름인지 확인
fun CkeckNum(s: String): Boolean {
    return try {
        s.toDouble()
        true
    } catch (e: NumberFormatException) {
        false
    }
}
