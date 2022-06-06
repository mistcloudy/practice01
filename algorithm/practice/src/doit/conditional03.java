package doit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class conditional03 {
    static int s (String s) {return Integer.parseInt(s);}
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] m = br.readLine().split(" ");
        String n = br.readLine();
        int o = 0;
        int p = 0;
        int t = 0;

        if ((s(m[1])+s(n)) >= 60 ) {
            o = (s(m[1])+s(n)) / 60;
            p = (s(m[1])+s(n)) % 60;
            t = (s(m[0])+o) % 24;  
            System.out.println(t + " " + p);
            } else {
                System.out.println(m[0] + " " + (s(m[1])+s(n)));
            }
        }
    }    

