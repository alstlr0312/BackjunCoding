
import javax.swing.text.html.HTML.Attribute.N


val br = System.`in`.bufferedReader()
fun brr() = br.readLine().split(' ').map { it.toInt() }
fun list()= br.readLine().split(' ').map { it.toInt() }.toIntArray()
fun main() = with(System.out.bufferedWriter()) {
    val n = br.readLine().toInt()
    val box = IntArray(n+1)
    val x = brr()
    for(i in x.indices){
        box[i]=x[i]
    }
    val dp = IntArray(n + 1)
    var result = 0
    for(i in 0..n){
        dp[i]=1
        for(j in 0 .. i){
            if(box[i]>box[j]){
                dp[i]= maxOf(dp[i],dp[j]+1)
            }
        }
        result= maxOf(result,dp[i])
    }
    write("${result}")
    close()
}