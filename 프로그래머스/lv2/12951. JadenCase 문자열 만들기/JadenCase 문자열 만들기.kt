
import java.util.*
class Solution {
    fun solution(s: String): String {
        var answer = ""
        val sarr = s.split(" ".toRegex()).toTypedArray()//띄어쓰기 기준으로 나누고 배열에 넣음
        for(i in sarr.indices){
            val word = sarr[i] //sarr에 들어있는 단어

            //만일 단어가 띄어쓰기 " "가 아니라 단어라면
           if(sarr[i].length != 0) {
               answer += word.substring(0,1).uppercase()
               answer += word.substring(1,word.length).lowercase()
               answer += " "
           }
           else answer += " "
        }
        
        return answer.substring(0, answer.length - 1)
    }
}

