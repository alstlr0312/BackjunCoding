import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.math.BigInteger
import java.util.*
import kotlin.math.abs
import kotlin.math.floor
import kotlin.math.max
import kotlin.math.min


class InputHandler {
    val br = System.`in`.bufferedReader()
    fun list(): MutableSet<Int> = br.readLine().split(" ").map { it.toInt() }.toMutableSet()
    fun input(): List<String> = br.readLine().split(" ")
    fun brr(): List<Int> = br.readLine().split(' ').map { it.toInt() }
}

val dx = intArrayOf(0, -1, 0, 1)
val dy = intArrayOf(-1, 0, 1, 0)
fun main()= with(System.out.bufferedWriter()) {
    val handler = InputHandler()
    val n = handler.br.readLine().toInt()
    val move = handler.br.readLine()
    val visited = Array(101) { BooleanArray(101) }
    var way = 0 // way는 4방향     0
                //             3     1  보는 방향
                //                2
    var y = 50
    var x = 50
    //맵의 가운데에서 시작
    visited[y][x] = true
    var maxY = 50
    var minY = 50
    var maxX = 50
    var minX = 50
    for (i in 0 until n) {
        when (move[i]) {
            'L' -> way = (way + 3) % 4
            'R' -> way = (way + 1) % 4
            else -> {
                y += dy[way]
                x += dx[way]
                visited[y][x] = true
                maxY = maxOf(maxY, y)
                minY = minOf(minY, y)
                maxX = maxOf(maxX, x)
                minX = minOf(minX, x)
            }
        }
    }
    for (i in maxY downTo minY) {
        for (j in minX..maxX) {
            if (visited[i][j]) {
                write(".")
            } else {
                write("#")
            }
        }
        write("\n")
    }
    close()
}
