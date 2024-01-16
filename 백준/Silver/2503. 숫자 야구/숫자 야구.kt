import java.util.*


val br = System.`in`.bufferedReader()
fun brr() = br.readLine().split(' ').map { it.toInt() }
fun list()= br.readLine().split(" ".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
var result = 0
var n = 0
var arr = Array(n) { IntArray(3) }
var strike = IntArray(n)
var ball = IntArray(n)
fun main() {
    n = readLine()!!.toInt()
    arr = Array(n) { IntArray(3) }
    strike = IntArray(n)
    ball = IntArray(n)

    for (i in 0 until n) {
        val st = StringTokenizer(readLine())
        val input = st.nextToken().toInt()
        arr[i][0] = input / 100
        arr[i][1] = input / 10 % 10
        arr[i][2] = input % 10
        strike[i] = st.nextToken().toInt()
        ball[i] = st.nextToken().toInt()
    }
    for(i in 123 until 988){
        val a = i / 100
        val b = i / 10 % 10
        val c = i % 10
        if (a == 0 || b == 0 || c == 0 || a == b || a == c || b == c)  continue;
        baseball(a,b,c)
    }
    println("${result}")
}

fun baseball(a: Int, b: Int, c: Int):Int {
    for(i in 0 until n){
        var strike2 = 0
        var ball2 = 0
        if(a==arr[i][0]) strike2++
        if(b==arr[i][1]) strike2++
        if(c==arr[i][2]) strike2++
        if(a==arr[i][1]||a==arr[i][2]) ball2++
        if(b==arr[i][0]||b==arr[i][2]) ball2++
        if(c==arr[i][0]||c==arr[i][1]) ball2++
        if(strike2!=strike[i]||ball2!=ball[i]) return result
    }
    return result++
}
