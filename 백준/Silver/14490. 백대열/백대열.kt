import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val (n, m) = br.readLine().split(":").map { it.toInt() }
    val gcd = gcd(maxOf(n, m), minOf(n, m))
    val res = "${n / gcd}:${m / gcd}"
    println(res)
    br.close()
}

fun gcd(a: Int, b: Int): Int {
    return if (a % b == 0) {
       b
    } else {
        gcd(b, a % b)
    }
}