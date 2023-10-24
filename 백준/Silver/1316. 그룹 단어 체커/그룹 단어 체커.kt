import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    var result = 0
    val n = br.readLine().toInt()

    repeat(n){
        val word = br.readLine().toString()
        val arr = ArrayList<Char>()
        var check = true
        arr.add(word[0])
        for(i in word.indices){
            if (arr[arr.size-1] != word[i]) {
                if (arr.contains(word[i])) {
                    check = false
                    break
                } else {
                    arr.add(word[i])
                }
            }
        }
        if(check){
            result++
        }
    }


    bw.write("$result")
    bw.flush()
}

