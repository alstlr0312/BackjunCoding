import java.io.BufferedReader
import java.io.InputStreamReader
import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.* fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val isPrime = BooleanArray(1000001) { true }
    val primes = ArrayList<Int>()

// 소수
    isPrime[1] = false
    for (i in 2..1000000) {
        if (isPrime[i]) {
            primes.add(i)
            var j = i * 2L
            while (j <= 1000000) {
                isPrime[j.toInt()] = false
                j += i
            }
        }
    }

    while (true) {
        val n = br.readLine().toInt()
        if (n == 0) break
        var result = ""
        for (prime in primes) {
            if (prime > n) {
                break
            }
            if (isPrime[n - prime]) {
                result = "$n = $prime + ${n - prime}"
                break
            }
        }
        if (result.isNotEmpty()) {
            bw.write("$result\n")
        }
    }
    bw.flush()
}