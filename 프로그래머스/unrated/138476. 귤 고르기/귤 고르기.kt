class Solution {
    fun solution(k: Int, tangerine: IntArray): Int {
        var answer: Int = 0
        val countMap = mutableMapOf<Int, Int>()
        for(num in tangerine){
            val count = countMap.getOrDefault(num, 0)
            countMap[num] = count + 1
        }
        val sortMap = countMap.entries.sortedByDescending { it.value }.associateBy({ it.key }, { it.value })
        var count = 0
        for (i in sortMap){
            if(count>=k){
                break
            }else{
                count+=i.value
                answer++
            }
        }
        return answer
    }
}