import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args)  throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()); //공백단위로 읽어드릴수 있는 라인 추가
        int a = Integer.parseInt(st.nextToken()); //한줄에서 공백 단위로 읽음
        int b = Integer.parseInt(st.nextToken()); //한줄에서 공백 단위로 읽음

        int A=getAns(a,b);// 최대 공약수
        int B=a*b/A;// 최소 공배수

        System.out.println(A);
        System.out.println(B);
    }

    static int getAns(int i, int j){
        if(i%j==0){
            return j;
        }
        return getAns(j,i%j);
    }
}
