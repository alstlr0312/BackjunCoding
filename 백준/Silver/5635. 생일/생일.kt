import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.time.LocalDate

data class People(val name: String, val birthday: LocalDate)
fun main() {
    val br = System.`in`.bufferedReader()
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val list = mutableListOf<People>()
    repeat(br.readLine().toInt()) {
        val (a, b, c, d) = br.readLine().split(" ")
        list.add(People(a, LocalDate.parse("$d-${c.padStart(2, '0')}-${b.padStart(2, '0')}")))
    }

    list.sortBy { it.birthday }

    bw.write("${list[list.size - 1].name}\n")
    bw.write(list[0].name)

    bw.flush()
}