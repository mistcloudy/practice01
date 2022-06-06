package doit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class conditional02 {
    static int s (String s) {return Integer.parseInt(s);}
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] m = br.readLine().split(" ");
        if (s(m[1]) >= 45) {
            System.out.println(m[0] + " " + (s(m[1])-45) );
        } else if (s(m[1]) < 45) {
            if (s(m[0]) == 0) {
                System.out.println(23 + " " + (60-(45-s(m[1]))));    
            } else {
                System.out.println((s(m[0])-1) + " " + (60-(45-s(m[1]))));
            }
        }
    }    
}
