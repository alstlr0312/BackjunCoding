import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val inputs = br.readLine().split(" ")
    val n = inputs[0].toInt()
    val m = inputs[1].toInt()

    val icecreams = Array(n + 1) { BooleanArray(n + 1) }
    for (i in 0 until m) {
        val lineInputs = br.readLine().split(" ")
        val a = lineInputs[0].toInt()
        val b = lineInputs[1].toInt()
        icecreams[a][b] = true
        icecreams[b][a] = true
    }

    var result = 0
    for (i in 1..n) {
        for (j in i + 1..n) {
            //만일 true면 이미 선택됨. 다음으로 넘어감
            if (icecreams[i][j]) continue 

            for (k in j + 1..n) {
                // 단일 둘 다 false면 새로운 아이ㅡ크림 종류이기에 ++
                if (!icecreams[j][k] && !icecreams[k][i]) {
                    result++
                }
            }
        }
    }
    bw.write(result.toString())
    bw.flush()

}
