import kotlin.system.exitProcess

val br = System.`in`.bufferedReader()
fun brr() = br.readLine().split(' ').map { it.toInt() }

fun main() = with(System.out.bufferedWriter()){
   var (n, m)=brr()
    var check = BooleanArray(n+1)
    var count =0
    for(i in 2..n){
        for(j in i..n step i){
            if(check[j]==false){
                count++
                check[j]=true
            }
            if(count == m){
                write("$j")
                close()
                exitProcess(0)
            }
        }
    }
}

