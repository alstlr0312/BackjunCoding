class Solution {
    fun solution(arr: IntArray): Int {
        //0,1의 최대 공약수
        var a = gcd(arr[0], arr[1])
        //0,1의 최소 공배수
        var answer = arr[0] * arr[1] / a
        
        //배열의 모든 수들의 공약수 공배수를 구함
        for (i in 2 until arr.size) {
            a = gcd(answer, arr[i])
            answer = answer * arr[i] / a
        }
        return answer
    }

    // 최대공약수
    private fun gcd(a: Int, b: Int): Int {
        return if (a % b == 0) b else gcd(b, a % b)
    }
}