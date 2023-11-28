val br = System.`in`.bufferedReader()
fun brr() = br.readLine().split(' ').map { it.toInt() }

fun main() = with(System.out.bufferedWriter()){
    val n=br.readLine().toInt()
    if(n and 1 ==1){
        write("SK")
    }
    else{
        write("CY")
    }
    close()
}