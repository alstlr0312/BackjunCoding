import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            long n = Long.parseLong(br.readLine());

            if (isPrime(n)) {
                String N = Long.toString(n);
                StringBuilder ren = new StringBuilder();
                for (int i = N.length() - 1; i>= 0;i--) {
                    char current = N.charAt(i);
                    switch (current) {
                        case '3':
                        case '4':
                        case '7':
                            System.out.println("no");
                            return;
                        case '0':
                            ren.append('0');
                            break;
                        case '1':
                            ren.append('1');
                            break;
                        case '2':
                            ren.append('2');
                            break;
                        case '5':
                            ren.append('5');
                            break;
                        case '8':
                            ren.append('8');
                            break;
                        case '6':
                            ren.append('9');
                            break;
                        case '9':
                            ren.append('6');
                            break;
                    }
                }
                if (isPrime(Long.parseLong(ren.toString()))) {
                    System.out.println("yes");
                }else{
                    System.out.println("no");
                }
            } else {
                System.out.println("no");
            }
        }

        public static boolean isPrime(long n) {
            if(n == 1){
                return false;
            }
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }
}