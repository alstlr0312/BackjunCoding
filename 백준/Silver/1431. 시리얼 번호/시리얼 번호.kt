import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()
    val sn = Array(n){""}
    repeat(n){
        sn[it] = br.readLine()//시리얼 번호 입력
    }

    //1번째 조건: 먼저 길이로 정렬
    //2번째 조건: isDigit로 숫자를 추출하고 이후에 숫자들을 합쳐서 높은 순서대로 정렬
    //마지막은 그냥
    sn.sortWith(compareBy({ it.length }, { it.filter { it2 -> it2.isDigit() }.sumOf { it3 -> it3.digitToInt() } }, { it }))

    sn.forEach { println(it) }


}
