import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args)  throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] a = new int[9];
        int sum = 0;
        for (int i = 0; i < 9; i++) {
            a[i] = Integer.parseInt(br.readLine());
            sum += a[i];
        }
        for(int i=0; i<8;i++){
            for(int j=i+1; j<9; j++){
                if(sum-a[i]-a[j]==100){
                    a[i]=100;
                    a[j]=100;
                    Arrays.sort(a);
                    for(int k=0; k<7;k++){
                        System.out.println(a[k]);
                    }
                    return;
                }
            }
        }
    }
}
