import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
   public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));//런타임 오류때문에 변경
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int n = Integer.parseInt(br.readLine());

            int a = 0;
            while (n > 0) {
                if (n % 2 == 1) {
                    System.out.print(a + " "); //같은 줄에 출력
                }
                n = n / 2;
                a++;
            }
            System.out.println(); // 다른 케이스
        }
    }
}