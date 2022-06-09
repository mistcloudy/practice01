package doit.day04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class basicMath04 {
    static int s (String s) {return Integer.parseInt(s);}
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] r = br.readLine().split(" ");
        int a = s(r[0]);
        int b = s(r[1]);
        int v = s(r[2]);
        int t = (v-b) / (a-b);
        if ((v-b) % (a-b) != 0) {
            t++;
        }
          System.out.println(t);
          
    }   
}
