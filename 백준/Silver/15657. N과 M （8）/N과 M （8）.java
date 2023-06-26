import java.io.*;
import java.util.*;

public class Main {
    static int n,m;
    static int[] a;
    static int[] b;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        b = new int[n];
        a = new int[m];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++){
            b[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(b);
        dfs(0, 0);
    }
    public static void dfs(int c, int d){
        if (c == m){
            for (int x : a){
                System.out.printf("%d ", x);
            }
            System.out.println();
            return;
        }
        for (int i = d; i < n; i++){
            a[c] = b[i];
            dfs(c + 1, i);
        }
    }
}