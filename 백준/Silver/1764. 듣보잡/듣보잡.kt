import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.lang.StringBuilder
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val (n, m) = br.readLine().split(" ").map { it.toInt() }
    val set = HashSet<String>()
    val sb = StringBuilder()
    val noseenoheard = mutableListOf<String>()
    repeat(n){
        set.add(br.readLine())
    }
    repeat(m){
        val check = br.readLine()
        if(set.contains(check)){
            noseenoheard.add(check)
        }
    }
    sb.appendLine(noseenoheard.size)
    noseenoheard.sorted().forEach {
        sb.appendLine(it)
    }

    bw.write("${sb}")
    bw.flush()
}