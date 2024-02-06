import java.util.*


val br = System.`in`.bufferedReader()

fun list() = br.readLine().split(" ").map { it.toInt() }.toMutableSet()
fun input() = br.readLine().split(" ")
fun brr() = br.readLine().split(' ').map { it.toInt() }

fun main() {
    val color = IntArray(4)
    val number = IntArray(10)
    var maxNum = 0
    var pair1 = 0
    var pair2 = 0
    var triple = 0
    var quad = 0
    for (i in 0 until 5) {
        val input = br.readLine().split(" ")
        val cardcolor = input[0][0]
        val cardnumer = input[1].toInt()
        when (cardcolor) {
            'R' -> color[0]++
            'B' -> color[1]++
            'Y' -> color[2]++
            else -> color[3]++
        }
        //해당 번호 몇개인지 확인
        number[cardnumer]++
        maxNum = Math.max(maxNum, cardnumer)
    }
    //같은 숫자가 몇개인지 확인
    for (i in 1..9) {
        when {
            number[i] == 2 -> {
                if (pair1 > 0) pair2 = i
                else pair1 = i
            }
            number[i] == 3 -> triple = i
            number[i] == 4 -> quad = i
        }
    }
    //같은색이 모두 같은지 확인 
    var flush = false
    if (color[0] == 5 || color[1] == 5 || color[2] == 5 || color[3] == 5)
        flush = true
    //연속된 숫자가 있는지 확인
    var straight = false
    for (i in 1..6) {
        if (number[i] != 0 && number[i + 1] != 0 && number[i + 2] != 0 && number[i + 3] != 0 && number[i + 4] != 0) {
            straight = true
            break
        }
    }
    when {
        flush && straight -> println(900 + maxNum)
        flush -> println(600 + maxNum)
        straight -> println(500 + maxNum)
        quad != 0 -> println(800 + quad)
        triple != 0 && pair1 != 0 -> println(700 + 10 * triple + pair1)
        triple != 0 -> println(400 + triple)
        pair1 != 0 && pair2 != 0 -> println(300 + 10 * Math.max(pair1, pair2) + Math.min(pair1, pair2))
        pair1 != 0 -> println(200 + pair1)
        else -> println(100 + maxNum)
    }
}

