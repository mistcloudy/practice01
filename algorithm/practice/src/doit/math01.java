package doit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class math01 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    
        String[] r = br.readLine().split(" ");
        System.out.println(Integer.parseInt(r[0])*Integer.parseInt(r[1]));
    }
}
