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
    val n = handler.br.readLine().toInt()

    val dp = Array(101) { IntArray(10) }
    dp[1][0] = 0
    for(i in 1 until 10) {
        dp[1][i] = 1
    }

    for(i in 2 until n+1) {
        for(j in 0 until 10) {
            when(j) {
                //2자리 (dp[2][0]) 10, 2자리 (dp[2][4]) 34 54, 2자리 (dp[2][6]) 56 76, 
                //3자리 (dp[3][5]) dp[3][5]=dp[2][4]+dp[2][6] 왜냐 3456,5456,5676,7656 4개
                //근데 끝자리가 0인경우와 9일때는 낼려가거나 올라가는 한가지 경우만 가능하기에 올라가거나 내려가는 하나의 조항만 추가 
                0 -> dp[i][j] = dp[i-1][1]
                9 -> dp[i][j] = dp[i-1][8]
                else -> dp[i][j] = (dp[i-1][j-1] + dp[i-1][j+1]) % 1000000000
            }
        }
    }

    var result = 0L
    dp[n].forEach { result += it }
    print(result%1000000000)
}
