package doit.day03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class basicMath01 {
    static int s(String s) {
        return Integer.parseInt(s);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] r = br.readLine().split(" ");
        int a = (s(r[2]) - s(r[1]));
        int b = s(r[0]);
        if ( a==0) {
            System.out.println(-1);
        } else {
            int c = (b/a)+1;
        if (c<0) {
            System.out.println(-1);
        } else {
            System.out.println(c);
        }
        }        
    }
}
