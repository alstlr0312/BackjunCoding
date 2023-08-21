class Solution {
    fun solution(storey: Int): Int {
        var top = storey
        var answer = 0
        while (top > 0) {
            val s = top % 10
            top /= 10
            if (s == 5) {
                if (top % 10 >= 5) {
                    answer += 10 - s
                    top++
                } else {
                    answer += s
                }
            } else if (s > 5) {
                answer += 10 - s
                top++
            } else {
                answer += s
            }
        }
        return answer
    }
}