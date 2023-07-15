import java.io.BufferedReader
import java.io.InputStreamReader
import java.lang.Exception

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val input = br.readLine().split(" ")
    val n = input[0].toInt()
    val k = input[1].toInt()
    val arr = br.readLine().toCharArray()
    var res = 0
    for (i in arr.indices) {
        if (arr[i] == 'P') {
            for (j in i - k..i + k) {
                if (j >= 0 && j < n && arr[j] == 'H') {
                    arr[j] = '0'
                    res++
                    break
                }
            }
        }
    }
    println(res)
}