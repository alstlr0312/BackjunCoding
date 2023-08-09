class Solution {
    fun solution(s: String): IntArray {
        val answer = intArrayOf(0, 0)
        var Ss = s
        while (Ss.length > 1) {
            var Alen = 0
            val newSs = StringBuilder()
            for (i in Ss.indices) {
                if (Ss[i] == '0') {
                    answer[1]++
                } else {
                    Alen++
                    newSs.append(Ss[i])
                }
            }
            Ss = Alen.toString(2)
            answer[0]++
        }
        return answer
    }
}
