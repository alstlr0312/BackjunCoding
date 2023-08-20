class Solution {
    fun solution(progresses: IntArray, speeds: IntArray): IntArray {
        val answer = mutableListOf<Int>()
        val f = IntArray(progresses.size)
        for(i in progresses.indices){
            if((100-progresses[i])%speeds[i]==0){
                f[i]=(100-progresses[i])/speeds[i]
            }else{
                f[i]=(100-progresses[i])/speeds[i]+1
            }
        }
        var a=f[0]
        var cnt=0
        
        for (i in progresses.indices) {
            if(f[i]>a){
                answer.add(cnt)
                cnt = 1
                a = f[i]
            }else{
                cnt+=1
            }
        }
        answer.add(cnt) // 마지막 작업 추가
        return answer.toIntArray()
    }
}