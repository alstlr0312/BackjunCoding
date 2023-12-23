import java.io.BufferedReader
import java.util.*


val br = System.`in`.bufferedReader()
fun brr() = br.readLine().split(' ').map { it.toInt() }
//fun list()= br.readLine().split(' ').map { it.toInt() }.toIntArray()
//val dp = Array(n + 1) { IntArray(n + 1) }
var sb = StringBuilder()
fun main() = with(System.out.bufferedWriter()) {
    val (n,m) = brr()
    var result=""
    var count=0
    val dna = Array(n) { br.readLine() }

    for (i in 0 until m) {
        var acgt = IntArray(4) { 0 }
        for (j in 0 until n) {
            when (dna[j][i]) {
                'A' -> acgt[0]++
                'C' -> acgt[1]++
                'G' -> acgt[2]++
                else -> acgt[3]++
            }
        }

        var max = acgt.maxOf { it }
        var index = acgt.indexOf(max)

        result += when (index) {
            0 -> 'A'
            1 -> 'C'
            2 -> 'G'
            else -> 'T'
        }
    }

    for (i in 0 until n) {
        for (j in 0 until m) {
            if (result[j] != dna[i][j]) {
                count++
            }
        }
    }

    write("${result}\n")
    write("${count}")
    close()
}

