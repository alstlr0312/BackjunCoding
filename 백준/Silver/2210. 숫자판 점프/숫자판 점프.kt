import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.IOException
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*
val map = Array(5) { IntArray(5) } // 맵 상태
val dx = intArrayOf(-1, 1, 0, 0)
val dy = intArrayOf(0, 0, -1, 1)
val arr = IntArray(6) // 6자리 정답 담는 배열
val list: ArrayList<String> = ArrayList()
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    var st: StringTokenizer?

    for (i in 0 until 5) {
        st = StringTokenizer(br.readLine())
        for (j in 0 until 5) {
            map[i][j] = Integer.parseInt(st.nextToken())
        }
    }
    for (i in 0 until 5)
        for (j in 0 until 5)
            dfs(i, j, arr, list)

    bw.write("${list.size}")
    bw.flush()
}

fun dfs(x: Int, y: Int, arr: IntArray, list: ArrayList<String>, depth: Int = 1) {
    if (depth > 6) {
        var str = ""
        //수를 만듬
        for (i in arr.indices)
            str += Integer.toString(arr[i])
        //만약 리스트안에 수가 없다면 추가
        if (!list.contains(str))
            list.add(str)
        return
    }
    arr[depth - 1] = map[x][y]

    for (i in dx.indices) {
        val nx = x + dx[i]
        val ny= y + dy[i]

        if(nx >=0 && nx <5 && ny >=0 && ny <5){
            dfs(nx ,ny ,arr ,list ,depth+1);
        }
    }
}
