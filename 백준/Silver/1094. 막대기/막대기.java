import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int result=0;
        int a=64;
        while (n > 0) {
            if (a > n) {
                a /= 2;
            } else {
                n -= a;
                result++;
            }
        }
        System.out.println(result);
    }

}