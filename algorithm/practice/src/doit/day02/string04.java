package doit.day02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class string04 {
    static int s(String s) {
        return Integer.parseInt(s);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int q = s(br.readLine());
        String[] d = new String[q];
        int t = 0;
        boolean u = false;
        for (int i = 0; i < q; i++) {
            d[i] = br.readLine();
            String[] f = d[i].split("");
            index: for (int j = 0; j < d[i].length(); j++) {
                u = true;
                for (int k = j + 1; k < d[i].length(); k++) {
                    if (f[j].equals(f[k]) && !(f[k].equals(f[k-1]))) {
                        u = false;
                        break index;
                    }
                }
            }
            if (u) {
                t++;
            }
        }
        System.out.println(t);
    }
}
