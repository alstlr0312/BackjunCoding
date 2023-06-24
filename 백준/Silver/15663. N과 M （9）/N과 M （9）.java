import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int n,m;
    static int[] arr;
    static StringBuilder sb = new StringBuilder();
    static HashSet<String> set = new HashSet<>();
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(in.readLine(), " ");

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[n];
        st = new StringTokenizer(in.readLine(), " ");
        for(int i=0;i<n;i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        dfs(0,new boolean[n],new int[m]);

        System.out.println(sb);

    }
    static void dfs(int cnt, boolean[] visited, int[] choose) {
        if(cnt == m) {
            StringBuilder temp = new StringBuilder();
            for(int i=0;i<cnt;i++) {
                temp.append(choose[i]).append(' ');
            }
            String str = temp.toString();
            if(!set.contains(str)) {
                set.add(str);
                sb.append(temp).append('\n');
            }
            return;
        }
        for(int i=0;i<n;i++) {
            if(!visited[i]) {
                choose[cnt] = arr[i];
                visited[i] = true;
                dfs(cnt+1, visited, choose);
                visited[i] = false;
            }
        }
    }
}