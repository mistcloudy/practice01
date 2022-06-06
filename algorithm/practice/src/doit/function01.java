package doit;

import java.io.IOException;
import java.util.Scanner;

public class function01 {
    public static int han (int s){
        int a = s/100;
        int b = (s/10)%10;
        int c = (s%100)%10;
        if ((a-b) == (b-c)) {
            return 1;
        }
        return 0;
    }    
    public static void main(String []args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        if (r < 100 ) {
            System.out.println(r);
        } else {
            int t = 99;
            for(int i=100; i<=r; i++) {
                t = t + han(i);
            }
            System.out.println(t);
        }
    }

}
