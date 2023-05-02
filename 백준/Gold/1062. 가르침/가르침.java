import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int n;
    static int k;
    static boolean[] v;
    static String[] word;
    static int ans = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        n = Integer.parseInt(input[0]);
        k = Integer.parseInt(input[1]);

        v = new boolean[26];
        word = new String[n];

        if (k < 5) {
            System.out.println(0);
            return;
        } else if (k == 26) {
            System.out.println(n);
            return;
        }
        
        v['a' - 'a'] = true;
        v['n' - 'a'] = true;
        v['t' - 'a'] = true;
        v['i' - 'a'] = true;
        v['c' - 'a'] = true;

        for (int i = 0; i < n; i++) {
            String str = br.readLine().replaceAll("anta|tica", "");

            word[i] = str;
        }

        visit(0, 0);
        System.out.println(ans);
    }

    static void visit(int a, int b) {
        if (b == k - 5) {
            int c = 0;
            for (int i = 0; i < n; i++) {
                boolean flag = true;
                for (int j = 0; j < word[i].length(); j++) {
                    if (!v[word[i].charAt(j) - 'a']) {
                        flag = false;
                        break;
                    }
                }

                if (flag) {
                    c++;
                }
            }
            ans = Math.max(c, ans);
            return;
        }

        for (int i = a; i < 26; i++) {
            if (!v[i]) {
                v[i] = true;
                visit(i, b + 1);
                v[i] = false;
            }
        }
    }

}