val br = System.`in`.bufferedReader()
fun list()= br.readLine().split(" ".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
fun input() = br.readLine().split(" ")
fun brr() = br.readLine().split(' ').map { it.toInt() }
val dx = intArrayOf(1, -1, 0, 0, 1, -1, 1, -1)
val dy = intArrayOf(0, 0, -1, 1, 1, 1, -1, -1)
fun main() = with(System.out.bufferedWriter()) {
    val(n,m)=brr()
    val map = Array(n) { CharArray(m) }
    for (i in 0 until n) {
        val input = br.readLine()!!
        for (j in 0 until m) {
            map[i][j] = input[j]
        }
    }
    var result = 0
    for(i in 0 until n){
        for(j in 0 until m){
            if(map[i][j]=='E' || map[i][j]=='I'){
                result+=mbti(i, j, map, n, m)

            }
        }
    }
    write("${result}")
    close()
}

fun mbti(y: Int, x: Int, map: Array<CharArray>, n: Int, m: Int): Int {
    var cnt = 0
    for (i in 0 until 8) {
        var nextx = x + dx[i]
        var nexty = y + dy[i]
        if (nexty < 0 || nextx < 0 || nexty >= n || nextx >= m) continue
        if (map[nexty][nextx] == 'N' || map[nexty][nextx] == 'S') {
            nextx += dx[i]
            nexty += dy[i]
            if (nexty < 0 || nextx < 0 || nexty >= n || nextx >= m) continue
            if (map[nexty][nextx] == 'F' || map[nexty][nextx] == 'T') {
                nextx += dx[i]
                nexty += dy[i]
                if (nexty < 0 || nextx < 0 || nexty >= n || nextx >= m) continue
                if (map[nexty][nextx] == 'P' || map[nexty][nextx] == 'J') {
                    cnt++
                }
            }
        }
    }
    return cnt
}

