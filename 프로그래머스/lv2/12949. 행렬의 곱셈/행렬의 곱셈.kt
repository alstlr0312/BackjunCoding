class Solution {
    fun solution(arr1: Array<IntArray>, arr2: Array<IntArray>): Array<IntArray> {
        var answer = Array(arr1.size) { IntArray(arr2[0].size) } // answer 배열 초기화
        //행렬의 크기는 앞쪽행*뒤쪽열
        //행렬의 곱을 구하는 공식은 answer[i][j[]+=arr1[i][k]*arr2[k][j]
        for(i in arr1.indices){
            for(j in arr2[0].indices){
                var a=0;
                for(k in arr2.indices){
                    a+=arr1[i][k]*arr2[k][j]
                }
                answer[i][j]=a
            }
        }
        return answer
    }
}