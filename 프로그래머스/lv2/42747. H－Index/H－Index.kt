class Solution {
    fun solution(citations: IntArray): Int {
        var answer = 0
        citations.sort()
        for(i in citations.indices){
            //지금부터 마지막번까지의 논문 수
            val h = citations.size - i
            //현재 인용된 횟수가 h보다 작거나 같을 때
            if(citations[i] >= h){
                answer = h
                break
            }
        }
        return answer
    }
}