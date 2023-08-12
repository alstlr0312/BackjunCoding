class Solution {
    fun solution(n: Int, a: Int, b: Int): Int {
        var answer = 0
        var A = a
        var B = b
        while(A != B) {
            A = (A + 1) / 2
            B = (B + 1) / 2
            answer++
        }
        return answer
    }
}