package doit;

import java.io.IOException;
import java.util.Scanner;

public class math06 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        if ( r==4 || r==7  ) {
            System.out.println(-1);
        } else if ( r%5 == 0 ) {
            System.out.println(r/5);
        } else if ( r%5 == 1 || r%5 == 3) {
            System.out.println((r/5)+1);
        } else if ( r%5 == 2 || r%5 == 4) {
            System.out.println((r/5)+2);
        }
    }
}
