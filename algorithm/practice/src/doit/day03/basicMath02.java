package doit.day03;

import java.io.IOException;
import java.util.Scanner;

public class basicMath02 {
 public static void main(String[] args) throws IOException {
     Scanner sc = new Scanner(System.in);
     int r = sc.nextInt();
 
     int t = 0;
     int c = 0;
     for (int i=0; i<=r; i ++) {
        t = t + i;
        int s = (6*t)+1;
        if (r>s) {
        c++;
        } else {
            break;
        }

     } 
     System.out.println(c+1);   
 }
}
