import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = mutableListOf<Int>()
    val m = mutableListOf<Int>()
    val result = mutableListOf<Int>()
    var des = 0
    var sum = 0
    repeat(8) {
        val input = br.readLine().toInt()
        n.add(input)
        result.add(input)
    }
    result.sortDescending()
    repeat(5){
        sum+=result[it]
        des=result[it]
        val index = n.indices.find{ n[it]==des}
        if (index != null) {
            m.add(index+1)
        }
    }
    bw.write("$sum\n")
    m.sort()
    for (a in m) {
        bw.write("$a ")
    }
    bw.flush()
}