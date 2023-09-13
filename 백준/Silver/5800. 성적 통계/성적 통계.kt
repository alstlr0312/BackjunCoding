import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val K = br.readLine().toInt() //반 개수 입력
    val arr = IntArray(51)

    for (k in 1..K) {
        val spilt = br.readLine().split(" ")
        //학생수
        val N = spilt[0].toInt()
        //성적
        val arr = spilt.subList(1, N+1).map { it.toInt() }.toIntArray()

        arr.sortDescending()

        bw.write("Class $k\n")
        bw.write("Max ${arr[0]}, ")
        bw.write("Min ${arr[N - 1]}, ")

        var largestGap = 0

        for (i in 1 until N) {
            val gap = arr[i - 1] - arr[i]
            if (gap > largestGap) {
                largestGap = gap
            }
        }

        bw.write("Largest gap $largestGap\n")
    }

    bw.flush()
}
