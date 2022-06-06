package doit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class math04 {
    static int s (String s) {return Integer.parseInt(s);}
    static int s1 (String s) {return Integer.parseInt(s)*10;}
    static int s2 (String s) {return Integer.parseInt(s)*100;}
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] m = br.readLine().split("");
        String[] n = br.readLine().split("");
        int o = (s(n[2])*s2(m[0]))+(s(n[2])*s1(m[1]))+(s(n[2])*s(m[2]));
        int p = (s(n[1])*s2(m[0]))+(s(n[1])*s1(m[1]))+(s(n[1])*s(m[2]));
        int q = (s(n[0])*s2(m[0]))+(s(n[0])*s1(m[1]))+(s(n[0])*s(m[2]));
        System.out.println(o);
        System.out.println(p);
        System.out.println(q);
        System.out.println(o+(p*10)+(q*100));
    }    
}
