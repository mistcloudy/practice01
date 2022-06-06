package doit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class math03 {
    static int s (String s) {return Integer.parseInt(s);}
    public static void main(String[] args) throws IOException  {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] r = br.readLine().split(" ");
        System.out.println((s(r[0])+s(r[1]))%s(r[2]));
        System.out.println(((s(r[0])%s(r[2]))+(s(r[1])%s(r[2])))%s(r[2]));
        System.out.println((s(r[0])*s(r[1]))%s(r[2]));
        System.out.println(((s(r[0])%s(r[2]))*(s(r[1])%s(r[2])))%s(r[2]));
    }
}
