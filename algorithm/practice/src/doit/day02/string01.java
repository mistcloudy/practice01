package doit.day02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class string01 {
        public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] r = br.readLine().strip().split("\\s");
        if (r[0]== "" ){
            System.out.println(0);
        } else {
            System.out.println(r.length);
        }
    }
}
 