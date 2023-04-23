import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int M = Integer.parseInt(br.readLine()); 
		int N = Integer.parseInt(br.readLine());
        int sum = 0;   
		int min = 10000; 

		for (int i = M; i <= N; i++) {
			boolean a = true; //소수는 true
			if (i == 1) {
				continue;
			}
			for (int j = 2; j <= Math.sqrt(i); j++) {
				if (i % j == 0) {
					a = false;
				}

			}
			if (a) {	
				sum += i;	
				if (min > i) {
					min = i;	
				}
			}
		}
		if (min == 10000) {
			System.out.println(-1);
		} else {					
			System.out.println(sum);	
			System.out.println(min);	
		}
	}

}