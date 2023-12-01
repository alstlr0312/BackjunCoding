val br = System.`in`.bufferedReader()
fun brr() = br.readLine().split(' ').map { it.toInt() }

fun main() = with(System.out.bufferedWriter()){
    val n=br.readLine().toInt()
    val dpa = Array(n + 1) { 0 }
    val dpb = Array(n + 1) { 0 }
    dpa[0]=1
    dpb[0]=0
    dpa[1] = 0
    dpb[1] = 1
    for(i in 1..n){
        dpa[i] = dpb[i - 1]
        dpb[i] = dpa[i - 1] + dpb[i - 1]
    }
    write("${dpa[n]} ${dpb[n]}")
    close()
}