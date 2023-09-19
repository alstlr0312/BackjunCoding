import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val tree = TreeMap<String, Float>()//자동으로 사전으로 배열해줌
    var cnt = 0f

    //나무를 입력 딕셔너리로 각각의 나무가 몇번 입력 받았는지 확인함
    while (true) {
        val str = br.readLine()
        if (str == null || str.isEmpty()) break
        cnt++
        tree[str] = tree.getOrDefault(str, 0f) + 1
    }

    //몇프로 존재하는지 계산하고 나무와 함께 출력
    for ((key, value) in tree) {
        val per = (value / cnt) * 100
        //bw.write("$key %.4f%n".format(per))
        bw.write(String.format("%s %.4f\n", key, per))
    }

    bw.flush()
}
