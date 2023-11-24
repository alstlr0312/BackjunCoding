import java.io.*
import java.util.*

val br = System.`in`.bufferedReader()
fun brr() = br.readLine().split(' ').map { it.toInt() }

val dir = arrayOf(
        arrayOf(-1,0),
        arrayOf(0,1),
        arrayOf(1,0),
        arrayOf(0,-1)
)
lateinit var graph: Array<IntArray>
var answer = 0
fun clean(n: Int, m: Int, r: Int, c: Int, d: Int){
    if(graph[r][c]==0) {
        graph[r][c] = -1
        answer++
    }
    var rotate = 4
    var way = d
    while(rotate>0){
        val nd = (way+3)%4
        val nr = r+dir[nd][0]
        val nc = c+dir[nd][1]
        if(nr !in 0 until n || nc !in 0 until m || graph[nr][nc] != 0) {
            way = nd
            rotate--
            continue
        }
        clean(n,m,nr,nc,nd)
        return
    }
    //4방향 모두 없는 경우
    val nr = r-dir[d][0]
    val nc = c-dir[d][1]
    if(nr in 0 until n && nc in 0 until m && graph[nr][nc] !=1){
        clean(n,m,nr,nc,d)
    }
}

fun main() = with(System.out.bufferedWriter()){
    val (n,m) = brr()
    val (r,c,d) = brr()
    graph = Array(n){ brr().toIntArray()}
    clean(n,m,r,c,d)
    write("$answer")

    close()
}