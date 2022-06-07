package doit.day02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class string02 {
    static String s (String s) {return new StringBuffer(s).reverse().toString(); }
    static int t ( String s) {return Integer.parseInt(s);}
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] r = br.readLine().split(" ");
        int a = t(s(r[0]));
        int b = t(s(r[1]));
        if (a>b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }
}
