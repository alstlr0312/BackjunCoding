import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long[] sum = new long[91];  //long으로 해야함 최대 길이떄문에
        sum[0] = 0;
        sum[1] = 1;
        int n = Integer.parseInt(br.readLine());
        for (int i = 2; i <= n; i++) {
            sum[i] = sum[i-1] + sum[i-2]; 
        }
        System.out.print(sum[n]);
    }
}