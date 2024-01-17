import java.util.*

val br = System.`in`.bufferedReader()

fun list()= br.readLine().split(" ".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()

fun input() = br.readLine().split(" ")
var result = 0
var n = 0
fun brr() = br.readLine().split(' ').map { it }
val dx = intArrayOf(1, -1, 0, 0, 1, -1, 1, -1)
val dy = intArrayOf(0, 0, -1, 1, 1, 1, -1, -1)
fun main() = with(System.out.bufferedWriter()) {
    val (king, stone, n) = brr()
    var kingX = king[0] - 'A'
    var kingY = king[1].toString().toInt() - 1
    var stoneX = stone[0] - 'A'
    var stoneY = stone[1].toString().toInt() - 1
    var newY = 0
    val N = n.toInt()
    val move = ArrayList<String>()
    repeat(N) {
        move.add(br.readLine())
    }
    for (i in 0 until N) {
        var m = 0
        if (move[i] == "R") m = 0
        else if (move[i] == "L") m = 1
        else if (move[i] == "B") m = 2
        else if (move[i] == "T") m = 3
        else if (move[i] == "RT") m = 4
        else if (move[i] == "LT") m = 5
        else if (move[i] == "RB") m = 6
        else m = 7

        val newX = kingX + dx[m]
        newY = kingY + dy[m]
        if (newX < 0 || newX >= 8 || newY < 0 || newY >= 8) {
            continue
        }
        if (newX == stoneX && newY == stoneY) {
            val newStoneX = stoneX + dx[m]
            val newStoneY = stoneY + dy[m]
            if (newStoneX < 0 || newStoneX >= 8 || newStoneY < 0 || newStoneY >= 8) {
                continue
            } else {
                stoneX = newStoneX
                stoneY = newStoneY
            }
        }
        kingX = newX
        kingY = newY
    }
    write("${'A' + kingX}${kingY + 1}\n")
    write("${'A' + stoneX}${stoneY + 1}")
    close()
}
