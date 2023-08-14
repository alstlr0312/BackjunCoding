class Solution {
    fun solution(n: Int): Long {
        val answer = IntArray(2001)
        answer[1] = 1
        answer[2] = 2
        for(i in 3..2000){
            answer[i] = (answer[i-2] + answer[i-1]) % 1234567
        }
        return answer[n].toLong()
    }
}