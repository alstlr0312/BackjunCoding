import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int H = Integer.parseInt(st.nextToken());
        int W = Integer.parseInt(st.nextToken());
        int[] b = new int[W];  //블럭의 개수
        int[] rain = new int[W];
        st = new StringTokenizer(br.readLine());
        int height = 0;
        for (int i = 0; i < W; i++) {
            b[i] = Integer.parseInt(st.nextToken()); // 블럭 수 입력
            height = Math.max(height, b[i]); //최대값 입력
            rain[i] = height;
        }

        height = 0;
        int ans = 0;
        for (int i = W - 1; i >= 0; i--) {
            height = Math.max(height, b[i]);
            rain[i] = Math.min(height, rain[i]);
            ans += rain[i] - b[i];
        }

        System.out.println(ans);
    }
}