import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Main {
    public static void main(String[] args) throws IOException {
         BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
    
         Long S = Long.parseLong(rd.readLine());
         Long N = 0L;
         int count=0;
            
         for(int i=1;;i++) {
             if(N>S) {
                 break;
             }
             N+=i;
             count++;
         }
          System.out.println(count-1);

    }
}
