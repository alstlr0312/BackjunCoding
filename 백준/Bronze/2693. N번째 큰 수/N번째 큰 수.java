import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken());
        for(int i=0; i<T ; i++){
            st = new StringTokenizer(br.readLine());
            int []A = new int[10];
            for(int j=0; j<10; j++){
                A[j] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(A);
            System.out.println(A[7]); 
        }
    } 
}