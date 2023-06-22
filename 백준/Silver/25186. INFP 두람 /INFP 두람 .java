import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int[] d = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            d[i] = Integer.parseInt(st.nextToken());
        }
        int max=0;
        long sum=0;
        for (int i=0; i<n; i++) {
            max = Math.max(max, d[i]);
            sum += d[i];
        }

        if (sum / 2 >= max) {
            System.out.println("Happy");
        } else if(sum == 1){
            System.out.println("Happy");
        } else {
            System.out.println("Unhappy");
        }
    }
}