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
fun main() {
    val handler = InputHandler()
    val dice = handler.br.readLine()
    val fix = StringTokenizer(handler.br.readLine()).run { IntArray(3) { nextToken().toInt() } }
    val distinctDice = fix.distinct().toIntArray()
    val result = IntArray(12)
    for (i in result.indices) {
        if (dice[i] == 'N') continue
        result[i] = when (i) {
            0 -> fix.num(1)
            1 -> fix.num(2)
            2 -> fix.num(3)
            3 -> fix.num(4)
            4 -> fix.num(5)
            5 -> fix.num(6)
            6 -> fix.fourofakind()
            7 -> distinctDice.fullhouse()
            8 -> distinctDice.littlestraight()
            9 -> distinctDice.bigstraight()
            10 -> distinctDice.Yacht()
            else -> fix.sum() + 12
        }
    }
    println(result.max())
}
private fun IntArray.num(n: Int) = (2 + count { it == n }) * n
private fun IntArray.fourofakind() = filter { n -> count { it == n } >= 2 }.run { if (isNotEmpty()) get(0) * 4 else 0 }
private fun IntArray.fullhouse() =
    if (size == 1) {//이미 3개가 같은 숫자 일 경우
        if (sum() == 6) { //만일 6이면 6*3+5*2가 최대
            28
        }
        else 12 + sum() * 3 //만일 6이 아닌 다른게 3개일경우 i*3+6*2 한게 최대
    }
    else if (size == 2) { //2개가 같은 숫자일경우
        max() * 3 + min() * 2 //같은거 2개와 다른거 한개에서 같은거와 다른거 더 큰 수를 *3하고 작은 수를 *2 한다.
    } else 0 //같은게 없으면 풀하우스가 안됨
private fun IntArray.littlestraight() = if (size == 3 && !contains(6)) 30 else 0 //6이 없고 중복된 수가 없으면 리틀스트뤠이트가 가능
private fun IntArray.bigstraight() = if (size == 3 && !contains(1)) 30 else 0 //중복된게 없고 1이 없으면 가능
private fun IntArray.Yacht() = if (size == 1) 50 else 0 //동일한 숫자가 3개면 가능 