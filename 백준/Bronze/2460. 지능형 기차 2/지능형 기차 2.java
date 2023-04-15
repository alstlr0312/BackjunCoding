import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int in;     // 탄 사람
        int out = 0;// 내린 사람
        int now = 0;// 현재있는 사람
        int max = 0;// 최대
        
        for(int i=0; i<10; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            out = Integer.parseInt(st.nextToken());
            in = Integer.parseInt(st.nextToken());

            now=now+in-out;

            if(max < now) {
                max = now;
            }
        }

        System.out.println(max);
    }

}