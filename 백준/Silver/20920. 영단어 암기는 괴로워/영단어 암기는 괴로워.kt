import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.time.LocalDate

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val (n, m) = br.readLine().split(" ").map { it.toInt() }
    val words = mutableMapOf<String,Int>()
    for(i in 0..n-1){
        val word = br.readLine()
        if(words.containsKey(word)){
            words[word] = words[word]!!+1
        }else{
            words.put(word,1)
        }
    }
    val sortedWords = words.toList().sortedWith(
                    compareByDescending<Pair<String, Int>> { it.second }
                            .thenByDescending { it.first.length }
                            .thenBy { it.first }
            )

    for ((word, count) in sortedWords) {
        if (word.length >= m) {
            bw.write("$word\n")
        }
    }
    bw.flush()
}