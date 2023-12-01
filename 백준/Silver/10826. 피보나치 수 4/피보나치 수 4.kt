import java.math.BigInteger

val br = System.`in`.bufferedReader()
fun brr() = br.readLine().split(' ').map { it.toInt() }

fun main() = with(System.out.bufferedWriter()){
    val n=br.readLine().toInt()
    //n은 10000보다 작거나 같은 자연수이기에 BigInteger를 사용해줘야함
    val f = arrayOfNulls<BigInteger>(n + 2)
    f[0] = BigInteger("0")
    f[1] = BigInteger("1")
    for (i in 2 until f.size) {
        f[i] = f[i - 1]!!.add(f[i - 2]!!)
    }
    write("${f[n]}")
    close()
}