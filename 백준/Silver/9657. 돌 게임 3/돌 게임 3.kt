val br = System.`in`.bufferedReader()
fun brr() = br.readLine().split(' ').map { it.toInt() }
fun list()= br.readLine().split(' ').map { it.toInt() }.toIntArray()
fun main() = with(System.out.bufferedWriter()) {
    val n = br.readLine().toInt()
    write(if (n % 7 == 0 || n % 7 == 2) "CY" else "SK")
    close()
}
