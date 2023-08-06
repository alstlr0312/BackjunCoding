import java.util.Stack;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        Stack<Character> stack = new Stack<Character>();

        for(int i=0; i<s.length(); i++){
            //만일 (면 스택에 (를 넣는다
            if(s.charAt(i) == '(')
                stack.push('(');
            else{
                // 만일 )가 들어왔는데 스택이 비어있으면 false
                if(stack.isEmpty())
                    return false;
                else
                // 만일 ) 가 있을 때 (가 있음 pop해줌
                    stack.pop();
            }
        }
        //만일 괄호들을 다 확인하고 스택이 비어 있으면 true
        //하지만 스택이 비어 있지 않으면 )만 남아 있다는 것이기에 false
        answer = (stack.isEmpty()) ? true : false;
        return answer;
    }
}