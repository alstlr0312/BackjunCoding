class Solution {
    fun solution(brown: Int, yellow: Int): IntArray {
        var answer = intArrayOf(0, 0)
        var capat = brown+yellow
        for(i in 1 until capat){
            var row = i
            var col = capat/row
            //가로는 세로와 같거나 김
            if(row>col)
                continue
            //노랭이는 카펫의 가운데 있음
            //노랭이의 개수는 (row-2) * (col -2)
            if((row-2)*(col-2)==yellow){
                answer[0]=col
                answer[1]=row
                break
            }
        }
        return answer
    }
}