package doit.day04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class basicMath07 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] r = br.readLine().split(" ");
        BigInteger a = new BigInteger(r[0]);
        BigInteger b = new BigInteger(r[1]);
       

        System.out.println(a.add(b));
    }
}
