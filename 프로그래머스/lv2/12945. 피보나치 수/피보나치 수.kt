class Solution {
    fun solution(n: Int): Int {
        var answer = IntArray(n + 1){1} // 모든 배열을 1로 초기화
        answer[0] = 0 // 0번째는 0이니깐 0으로 전환
        if (n > 2) { // 1과 2는 1이므로 1과 2는 1 그대로 두고 나머지는 계산
            for (i in 3..n) {
                answer[i] = (answer[i-1] + answer[i-2]) % 1234567
            }
        }
        return answer[n]
    }
}
