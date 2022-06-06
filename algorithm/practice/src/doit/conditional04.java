package doit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class conditional04 {
    static int s (String s) {return Integer.parseInt(s);}
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] m = br.readLine().split(" ");
        int a = s(m[0]);
        int b = s(m[1]);
        int c = s(m[2]);
        if (a != b && b != c && a !=c  ) {
            System.out.println((Math.max(Math.max(a, b), c))*100);
        } else if (a == b && b == c && a ==c  ) {
            System.out.println(10000 + (a*1000));
        } else {
            if (a==b || a ==c) {
                System.out.println(1000 + (a*100));
            } else {
                System.out.println(1000 + (b*100));
            }
        }
    }    
}
