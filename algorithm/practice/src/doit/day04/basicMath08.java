package doit.day04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class basicMath08 {
    static int s (String s) {return Integer.parseInt(s);}
    public static void main(String[] args) throws IOException {
        BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
        int y = s(br.readLine());
        String[] r = br.readLine().split(" ");
        int c = 0;
        
        for (int i=0; i<y; i++) {
            boolean o = true;
            int n = s(r[i]);
            if(n==1 ){
                o = false;
            } else if (n==2) {
                o = true;
            }
            for (int j=2; j<n; j++) {
                if (n%j==0) {
                    o = false;
                }
            }
            if (o) {
                c++;
            }
        }
        System.out.println(c);

    }    
}
