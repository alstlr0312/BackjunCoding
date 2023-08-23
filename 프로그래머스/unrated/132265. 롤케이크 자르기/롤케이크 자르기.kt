class Solution {
    fun solution(topping: IntArray): Int {
        var answer: Int = 0
        //형 토핑
        var bb = IntArray(topping.size){0}
        //동생 토핑
        var sb = IntArray(topping.size){0}
        var menuCount = mutableSetOf<Int>()

        // 형의 토핑 수
        for(i in 0 ..topping.size-1){
            menuCount.add(topping[i])
            bb[i] = menuCount.size
        }

        menuCount.clear()

        // 동생의 토핑 수
        for(i in topping.size-1 downTo 0){ // 형이 (i+1)개를 먹었을때의 동생의 종류의 수
            menuCount.add(topping[i])
            sb[i] = menuCount.size
        }
        for(i in 0 until topping.size-1){ // 형이 (i+1)개를 먹었을 때 형과 동생의 종류의 수 비교
            if(bb[i] == sb[i+1]) answer++
        }
        return answer
    }
}