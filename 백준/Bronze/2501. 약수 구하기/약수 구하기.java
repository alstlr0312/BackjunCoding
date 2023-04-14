import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
          public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int a = 0;//순서저장
        int b = 0;//결과값
        for (int i = 1; i <= N; i++) {
            if(N%i==0){
                a++;
            }
            if(a==K){
                b=i;
                break;
            }
        }
        System.out.println(b);
    }
}
