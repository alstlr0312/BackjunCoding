import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());    // 테스트 케이스

        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            int count = 0;
            LinkedList<int[]> q = new LinkedList<>();
            st = new StringTokenizer(br.readLine());

            for(int i=0; i<N; i++){
                q.offer(new int[] { i, Integer.parseInt(st.nextToken()) });
            }

            while(!q.isEmpty()){
                int[] frist=q.poll();
                boolean big = true;
                for(int i=0; i< q.size();i++){
                    if(frist[1] < q.get(i)[1]){
                        q.offer(frist);
                        for(int j=0; j<i; j++){
                            q.offer(q.poll());
                        }
                        big = false;
                        break;
                    }
                }
                if(big== false) {
                    continue;
                }
                count++;
                if(frist[0] == M){
                    System.out.println(count);
                    break;
                }
            }


        }
    }
}
