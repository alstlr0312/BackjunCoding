import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        //에라토스테네스의 체 이용
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int a = 0;
        int sosu =0;//약수 개수
        int sum = 0;//개수
        for(int i=0; i<N; i++){
            a = Integer.parseInt(st.nextToken());
            for(int j=1; j<=a; j++){
                if(a%j==0){//약수개수 판단
                    sosu++;
                }
            }
            if(sosu==2)//소수는 본인과 1만 약수로 가짐
                sum++;
            sosu=0;
        }
        System.out.println(sum);
    }


}