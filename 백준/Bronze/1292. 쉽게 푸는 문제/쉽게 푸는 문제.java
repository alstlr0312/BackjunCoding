	import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
 
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = 0;
		int[] box = new int[1000];
		
		int x = 1;
		
		for(int i = 0 ; i < 1000 ; i++) {
			box[i] = x;
			C++;
			if(x == C) {
				x++;
				C = 0;
			}
		}
		
		int sum = 0;
		for(int i = A ; i <= B ; i++) {
			sum += box[i-1];
		}
		
		System.out.println(sum);
	}
}