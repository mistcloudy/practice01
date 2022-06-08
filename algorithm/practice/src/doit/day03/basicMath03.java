package doit.day03;

import java.io.IOException;
import java.util.Scanner;

public class basicMath03 {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int x = 1;
        int y = 0;

        while(true) {
        if ( a <= x + y) {
            if (x%2 ==1 ) {
                System.out.println((x+y-a+1)+ "/" + (a-y)); 
                break;
            } else {
                System.out.println((a-y)+ "/" + (x+y-a+1));  
                break;
            }
        } else {
            y += x;
            x++;
        }
    }
       

    }   
}
