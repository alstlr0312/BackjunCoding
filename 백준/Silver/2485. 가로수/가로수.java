import java.io.*;
import java.util.*;

public class Main {
    static int[] t;
       public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        t=new int[n];
        for(int i=0;i<n;i++){
            t[i]=Integer.parseInt(br.readLine());
        }
        Arrays.sort(t);
        int GCD=0;
        for (int i = 0; i < n - 1; i++) {
            int gap = t[i + 1] - t[i];
            if (GCD == 0) {
                GCD = gap;
            } else {
                GCD = gcd(gap,GCD);
            }
        }
        int result;
        if (GCD == 0) {
            result = 0;
        } else {
            result = (t[n-1] - t[0]) / GCD + 1 - n;
        }

        System.out.println(result);
    }
    public static int gcd(int a, int b) {
        if (a % b == 0) {
            return b;
        } else {
            return gcd(b, a % b);
        }
    }
}