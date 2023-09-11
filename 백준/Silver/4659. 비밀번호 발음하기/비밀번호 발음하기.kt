import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val sb = StringBuilder()
    while (true) {
        val s = br.readLine()
        if (s == "end") break
        sb.append(check(s))
    }
    bw.write("$sb")
    bw.flush()
}

fun check(s: String): String {
    var aeiou= false
    var can = true
    var last: Char = '1'
    var ja = 0
    var mo = 0
    val Mo = charArrayOf('a', 'e', 'i', 'o', 'u')

    for (i in s.toCharArray()) {
        var ismo = false
        for (m in Mo) {
            if (m == i) {
                ismo = true
                break
            }
        }
        if (ismo) { // 모음
            aeiou = true
            mo++
            ja = 0
        } else { // 자음
            ja++
            mo = 0
        }
        if (last != 'e' && last != 'o' && last == i) {
            can= false;
            break;
        }
        if(ja==3 ||mo==3){
            can=false;
            break;
        }
        last=i;
    }

    var re="<$s> is "
    if(!aeiou || !can){
        re+="not acceptable."
    }else{
        re+="acceptable."
    }
    re+="\n"
    return re;
}
