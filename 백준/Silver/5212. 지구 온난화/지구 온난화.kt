import java.util.*

val br = System.`in`.bufferedReader()

fun list() = br.readLine().split(" ").map { it.toInt() }.toMutableSet()
fun input() = br.readLine().split(" ")
fun brr() = br.readLine().split(' ').map { it.toInt() }

fun main() {
    val (r,c) = brr()
    val map = Array<CharArray>(r) { CharArray(c) } // 지도 입력
    for (i in 0 until r) {
        map[i] = br.readLine().toCharArray()
    }
    val di = intArrayOf(0, 1, 0, -1)
    val dj = intArrayOf(1, 0, -1, 0)
    //지도 범위
    var minR = 10
    var minC = 10
    var maxR = 0
    var maxC = 0
    val after50year = Array<CharArray>(r) { CharArray(c) }

    for (i in 0 until r) {
        for (j in 0 until c) {
            if (map[i][j] === 'X') { // 땅평e평rq평
                var cnt = 0
                for (k in 0..3) {
                    val x = i + di[k]
                    val y = j + dj[k]
                    if (x == -1 || y == -1 || x == r || y == c || map[x][y] === '.') {
                        cnt++
                    }
                }
                if (cnt < 3) { // 3면 이하가 바다인 경우
                    after50year[i][j] = 'X'
                    minR = Math.min(minR, i)
                    minC = Math.min(minC, j)
                    maxR = Math.max(maxR, i)
                    maxC = Math.max(maxC, j)
                } else {
                    after50year[i][j] = '.'
                }
            } else {
                after50year[i][j] = '.'
            }
        }
    }

    val answer = StringBuilder()
    for (i in minR..maxR) {
        for (j in minC..maxC) {
            answer.append(after50year[i][j])
        }
        answer.append("\n")
    }
    println(answer)
}



