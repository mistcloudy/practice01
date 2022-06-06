package doit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class math05 {
    static int s (String s) {return Integer.parseInt(s);}
    static String t (int t) {return Integer.toString(t);}
    public static void main(String[] args) throws IOException{ 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        String b = br.readLine();
        String c = br.readLine();
        String[] r = t((s(a)*s(b)*s(c))).split("");
        for (int i=0; i<10; i++){
            System.out.println(Collections.frequency(Arrays.asList(r), t(i)));    
        }
    }    
}
