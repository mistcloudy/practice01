package doit.day04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class basicMath06 {
    static int s (String s) { return Integer.parseInt(s);}
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = s(br.readLine());
        for (int i=0; i<t; i++) {
            int a = s(br.readLine());
            int b = s(br.readLine());
            int c = 0;
            int d = 1;
            int n = 0;
            int[] k = new int[b];
            k[0] = 0;
            while (n<b) {
                n++; 
                c += d;
                k[n-1] = c;  // 0 1 3 6
                d++;
            }

            for ( int j=0; j<a-1; j++) {
                for ( int l=1; l<b; l++) {
                k[l] = k[l] + k[l-1];
                }
            }

            System.out.println(k[b-1]);

            
        }  
    }    
}
//  12345/ 1 3 6 10 15  2345 / 1 4 10 20 35  361015