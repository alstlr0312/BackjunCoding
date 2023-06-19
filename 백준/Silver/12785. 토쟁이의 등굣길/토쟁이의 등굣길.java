import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1[] = br.readLine().split(" ");
        String str2[] = br.readLine().split(" ");
        int w = Integer.parseInt(str1[0]);
        int h = Integer.parseInt(str1[1]);
        int x = Integer.parseInt(str2[0]);
        int y = Integer.parseInt(str2[1]);
        long load[][] = new long[h][w];
        for (int i = 0; i < h; i++) {
            load[i][0] = 1;
        }
        for (int i = 1; i < w; i++) {
            load[0][i] = 1;
        }
        for (int i = 1; i < h; i++) {
            for (int j = 1; j < w; j++) {
                load[i][j] = (load[i - 1][j] + load[i][j - 1]) % 1000007;
            }
        }
        System.out.print(String.valueOf((load[y - 1][x - 1] * load[h - y][w - x]) % 1000007));
    }
}
