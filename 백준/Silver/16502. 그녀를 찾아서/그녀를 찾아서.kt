import java.util.*
val br = System.`in`.bufferedReader()

fun list() = br.readLine().split(" ").map { it.toInt() }.toMutableSet()
fun input() = br.readLine().split(" ")
fun brr() = br.readLine().split(' ').map { it.toInt() }

var city = 0
val cost = Array(10){ IntArray(10) }
val visited = BooleanArray(10)
var result  = DoubleArray(4)
var time = 0
var line = 0
val per = Array(4) { ArrayList<Pair<Int, Double>>() }

fun main() = with(System.out.bufferedWriter()) {
    time = br.readLine().toInt()
    line = br.readLine().toInt()

    repeat(line) {
        val (s, e, p) = br.readLine().split(" ")
        per[s[0] - 'A'].add(Pair(e[0] - 'A', p.toDouble())) //s->e로 가는 것의 확률을 저장
    }
    //4개의 매장중 첫번째 매장은 무작위
    for (i in 0 until 4) {
        dfs(i, 0.25, 0)
    }

    for (i in 0 until 4) {
        println(String.format("%.3f", result[i]))
    }

    close()
}
fun dfs(now: Int, p: Double, cnt: Int) {
    if (cnt == time) {
        result[now] += p * 100
        return
    }

    for (i in per[now]) {
        dfs(i.first, p * i.second, cnt + 1)
    }
}