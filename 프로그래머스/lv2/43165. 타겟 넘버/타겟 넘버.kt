class Solution {
    var answer = 0
    fun solution(numbers: IntArray, target: Int): Int {
        dfs(numbers,0,target,0)
        return answer
    }

    fun dfs(numbers: IntArray, a: Int, target: Int, sum: Int) {
        //탐색 끝
        if (a == numbers.size) {
            if (target == sum) answer++
        } else {
            //더하기
            dfs(numbers, a + 1, target, sum + numbers[a])
            //빼기
            dfs(numbers, a + 1, target, sum - numbers[a])
        }
    }
}