import java.util.HashMap

class Solution {
    fun solution(clothes: Array<Array<String>>): Int {
        var answer = 1
        val map = HashMap<String, Int>()
        //옷 종류 구별
        for (clothe in clothes) {
            val type = clothe[1]
            map[type] = map.getOrDefault(type, 0) + 1
        }

        val it = map.values.iterator()
        // 조합 계산
        while (it.hasNext())
            answer *= it.next() + 1
        return answer - 1
    }
}