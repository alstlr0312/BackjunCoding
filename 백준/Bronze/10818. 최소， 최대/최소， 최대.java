import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());//입력할 개수 입력
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int min = 1000001;
		int max = -1000001;
			
		for(int i = 0; i < N; i++){
			int a = Integer.parseInt(st.nextToken());	
			if(min > a)
				min = a;
			if(max < a)
				max = a;
		}

		System.out.print(min + " " + max);
	}
}