
val br = System.`in`.bufferedReader()
fun list()= br.readLine().split(" ".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
fun input() = br.readLine().split(" ")
fun brr() = br.readLine().split(' ').map { it.toInt() }
val dx = intArrayOf(1, -1, 0, 0, 1, -1, 1, -1)
val dy = intArrayOf(0, 0, -1, 1, 1, 1, -1, -1)
var result = 0
val month = intArrayOf(0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)
val day = intArrayOf(1, 2, 3, 4, 5, 6, 7)//월화수목금토일 금=4

fun main() = with(System.out.bufferedWriter()) {
    val n = br.readLine().toInt()
    var today = 0
    for (i in 2019..n) {
        if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0) {
            month[2] = 29
        } else {
            month[2] = 28
        }
        for (j in 1..12) {
            if(day[(today+13)%7]==5){
                result++
            }
            today+=month[j]
        }
    }
    write("$result")
    close()
}



