import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.abs

lateinit var arr: Array<Int>
var n = 0
var count = 0

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    n = br.readLine().toInt()
    arr = Array(n) { 0 }
    queen(0)
    println(count)
}

fun check(idx: Int): Boolean {
    for(i in 0 until idx){
        if(arr[idx] == arr[i] || idx-i == abs(arr[idx]-arr[i])){
            return false
        }
    }
    return true
}

fun queen(idx: Int){
    if(idx == n){
        count++
        return
    }
    for(i in 0 until n){
        arr[idx]=i
        if(check(idx)){
            queen(idx+1)
        }
    }
}