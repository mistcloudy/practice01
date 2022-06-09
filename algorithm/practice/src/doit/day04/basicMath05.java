package doit.day04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class basicMath05 {
    static int s (String s) {return Integer.parseInt(s);}
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String t = br.readLine();
        int z = s(t);
        int[] q = new int[z];
        for (int i=0; i<z; i++) {
        String[] r = br.readLine().split(" ");
        int a = s(r[0]);
        int b = s(r[1]);
        int c = s(r[2]);
        int g = (a*b)-c;
        int f = (100*(a-(g%a)))+(b-(g/a));
        q[i] = f;
        }
        for (int j=0; j<z; j++){
            System.out.println(q[j]);
        }
    }    
}
