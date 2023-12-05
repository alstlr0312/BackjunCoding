val br = System.`in`.bufferedReader()
fun brr() = br.readLine().split(' ').map { it.toInt() }
fun list()= br.readLine().split(' ').map { it.toInt() }.toIntArray()

fun main() = with(System.out.bufferedWriter()){
    val t = br.readLine().toInt()
    repeat(t){
        val n = br.readLine().toInt()
        var result = -1000001
        val arr = brr()
        for(i in 0 until n){
            for(j in i until n){
                val sum = arr.subList(i,j+1).sum()
                if(result<sum) result=sum
            }
        }
        write("$result\n")
    }
    close()
}