import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    var n = br.readLine().toInt() - 1
    val word = br.readLine()
    val len = word.length
    val alphabet = IntArray(26)
    //어떤 알파벳이 있는지 확인
    for (i in 0 until len) {
        alphabet[word[i] - 'A']++
    }

    var result = 0

    while (n-- > 0) {
        val al = alphabet.clone()
        val comp = br.readLine()
        var check = 0
        for (i in 0 until comp.length) {
            if (al[comp[i] - 'A'] > 0) {
                check++
                al[comp[i] - 'A']--
            }
        }

        if (len - 1 == comp.length && check == comp.length) { // 길이가 한글자 작을 때
            result++
        } else if (len == comp.length) { // 길이가 같을 때
            if (check == len || check == len - 1) result++
        } else if (len + 1 == comp.length) { // 길이가 한글자 클 때
            if (check == len) result++
        }
    }

    bw.write("$result")
    bw.flush()
}