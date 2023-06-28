import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int a2 = Integer.parseInt(st.nextToken());
        int a1 = Integer.parseInt(st.nextToken());
        int a0 = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(br.readLine());
        int n0 = Integer.parseInt(br.readLine());
        int A=a2-c;
        double n;
        if(a2==c){
            n=n0;
        }else{
            n = Math.max((double) a1 / (-2 * (a2 - c)), n0);
        }
        if (A*n*n+a1*n+a0 >= 0 && A>= 0) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}