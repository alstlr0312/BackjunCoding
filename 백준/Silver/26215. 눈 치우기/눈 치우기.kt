import java.util.PriorityQueue

val br = System.`in`.bufferedReader()
fun list()= br.readLine().split(" ".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
fun input() = br.readLine().split(" ")
fun brr() = br.readLine().split(' ').map { it.toInt() }
val dx = intArrayOf(1, -1, 0, 0, 1, -1, 1, -1)
val dy = intArrayOf(0, 0, -1, 1, 1, 1, -1, -1)
var result = 0
fun main() = with(System.out.bufferedWriter()) {
    val n = br.readLine().toInt()
    val input = brr()
    val house = PriorityQueue<Int>(Comparator.reverseOrder())
    for(i in 0 until n){
        house.offer(input[i])
        if(input[i]>1440){
            write("-1")
            close()
            return@with
        }
    }
    while(!house.isEmpty()){
        var max = house.poll()
        if(house.isEmpty()){
            result += max
            break
        }
        var secondmax = house.poll()
        result+=secondmax
        house.offer(max-secondmax)
    }
    if(result>1440) write("-1")
    else write("$result")

    close()
}

