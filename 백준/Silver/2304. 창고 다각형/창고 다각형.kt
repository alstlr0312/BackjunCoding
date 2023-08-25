import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()
    val arr = IntArray(1001)
    var start = Int.MAX_VALUE // 기둥의 시작점
    var end = 0 //기둥의 마지막
    for (i in 0 until n) {
        val st = StringTokenizer(br.readLine())
        val L = st.nextToken().toInt()
        val H = st.nextToken().toInt()
        arr[L] = H
        start = minOf(L, start)
        end = maxOf(L, end)
    }
    val height: Stack<Int> = Stack() //기둥의 높이
    // 왼쪽 c창고 넓이 계산
    var h = arr[start] //현재 가장 높은 창고
    for (i in start + 1..end) {
        //현재 높이가 시작점보다 작으면 스택에 넣으줌
        if (arr[i] < h) {
            height.push(i)
        }
        //만일 현재 높이보다 높거나 크다면
        else {
            //현재 높이를 제외한 나머지 높이를 h로 변경
            while (!height.isEmpty()) {
                val x = height.pop()
                arr[x] = h
            }
            //변경후 가장 높은 창고를 변경
            h = arr[i]
        }
    }
    //스택 초기화
    height.clear()

    // 오른쪽 창고 넓이도 왼쪽과 동일
    h=arr[end]//현재 가장 높은 창고
    for(i in end - 1 downTo start){
        if(arr[i] < h){
            height.push(i)
        }
        else {
            while (!height.isEmpty()) {
                val x=height.pop()
                arr[x]=h
            }
            h=arr[i]
        }
    }

    //현재 높이가 곧 그 공간의 넓이이므로 높이를 전부 합하면 해결
    var answer=0
    for (i in start..end) {
        answer += arr[i]
    }
    println(answer)
}
