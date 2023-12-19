import java.util.*

val br = System.`in`.bufferedReader()
fun brr() = br.readLine().split(' ').map { it.toInt() }
fun list()= br.readLine().split(' ').map { it.toInt() }.toIntArray()
//val dp = Array(n + 1) { IntArray(n + 1) }
fun main() = with(System.out.bufferedWriter()) {
    val n = br.readLine().toInt()
    val dp = IntArray(n + 1){1}
    val s = IntArray(n + 1)
    val st = StringTokenizer(br.readLine())
    var result = 0
    for (i in 1..n) {
        s[i] = st.nextToken().toInt()
    }

    for (i in 1..n) {
        for(j in 0 until  i){
            if(s[j]>s[i]){
                dp[i]=Math.max(dp[i],dp[j]+1)
            }
        }
        result=Math.max(result,dp[i])
    }
    
    write("${n-result}")
    close()
}
