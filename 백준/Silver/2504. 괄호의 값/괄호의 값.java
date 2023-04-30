import java.io.*;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String bracket = br.readLine();

		Stack<Character> st = new Stack<>();
		boolean close = true; 
		int a = 0;
		int cnt =1;
		for(int i=0; i<bracket.length(); i++) {
			char cur = bracket.charAt(i);
			if(cur == '(') {
				st.push(cur);
				cnt *= 2;
			}
			else if(cur == '[') {
				st.push(cur);
				cnt *= 3;
			}
			else {
				if(cur == ')') {
					if(st.isEmpty() || st.peek() != '(') {
						close=false;
						break;
					}
					if(bracket.charAt(i-1) =='(') {
						a += cnt;
					}
					st.pop();
					cnt /= 2;
				}else if(cur==']') {
					if(st.isEmpty() || st.peek() != '[') {
						close=false;
						break;
					}
					if(bracket.charAt(i-1)=='[') {
						a += cnt;
					}
					st.pop();
					cnt /= 3;
				}
				else {
					close = false;
					break;
				}
			}
		}
		if(!close || !st.isEmpty()) {
			System.out.println(0);
		}else {
			System.out.println(a);
		}
	}
}