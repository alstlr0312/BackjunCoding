import kotlin.system.exitProcess

val br = System.`in`.bufferedReader()
fun brr() = br.readLine().split(' ').map { it.toInt() }

fun main() = with(System.out.bufferedWriter()){
    val (n,m)=brr()

    val gold = IntArray(n)
    val silver = IntArray(n)
    val bronze = IntArray(n)
    val country = IntArray(n)
    var result = 0

    for (i in 0 until n) {
        var (c, g, s, b) = brr()
        gold[c - 1] = g
        silver[c - 1] = s
        bronze[c - 1] = b
        country[i] = c
    }
    val ranks = IntArray(n) { 1 }

    for (i in 0 until n) {
        for (j in 0 until n) {
            if (gold[i] < gold[j]) ranks[i]++
            else if (gold[i] == gold[j] && silver[i] < silver[j]) ranks[i]++
            else if (gold[i] == gold[j] && silver[i] == silver[j] && bronze[i] < bronze[j]) ranks[i]++
        }
    }
    val x = country.indexOf(m)

    write("${ranks[x]}")
    close()
}