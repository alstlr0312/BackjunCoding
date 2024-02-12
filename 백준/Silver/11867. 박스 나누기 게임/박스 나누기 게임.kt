val br = System.`in`.bufferedReader()

fun list() = br.readLine().split(" ").map { it.toInt() }.toMutableSet()
fun input() = br.readLine().split(" ")
fun brr() = br.readLine().split(' ').map { it.toInt() }

fun main() {
    val(n,m)=brr()
    if(n%2==0 || m%2==0){
        println("A")
    }else println("B")
}