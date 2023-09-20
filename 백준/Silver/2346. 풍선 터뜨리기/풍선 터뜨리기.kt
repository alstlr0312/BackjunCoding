import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = br.readLine().toInt()
    val balloon = ArrayList<Pair<Int,Int>>()
    //풍선[이동할 거리, 풍선의 번호(인덱스)]
    br.readLine().split(' ').take(n).map { it.toInt() }.forEachIndexed { idx, i ->
        balloon.add(Pair(i, idx + 1))
    }
    var state = 0 //위치
    while(true){
        bw.write("${balloon[state].second} ") //현재 풍선 인덱스 출력
        bw.flush()
        var move = balloon[state].first //현재 이동해야할 거리
        balloon.removeAt(state) //현재 풍선 제거
        if(balloon.isEmpty()) break
        //이동 거리가 양수일시 -1해야함 위에서 현재 풍선은 없어졌기 때문에
        if(move>0){
            move--
        }
        //현재 위치 변경
        state += move
        //state가 풍선리스트 안에 있는지 확인
        while(state !in balloon.indices){
            //음수이면 리스트 크기만큼 추기로 더해서 조정
            if(state<0){
                state+=balloon.size
            }
            //양수면 나눈 나머지 값을 추가
            else{
                state%=balloon.size
            }
        }
    }
}
