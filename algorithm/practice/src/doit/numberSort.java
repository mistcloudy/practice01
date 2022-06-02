package doit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class numberSort  {
    static int stoi(String s) { return Integer.parseInt(s);}
   public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = stoi(br.readLine());
    int[] m = new int[n];

    for  (int i = 0; i < n; i++){
        int o = stoi(br.readLine());
        m[i] = o;
    }   
    Arrays.sort(m);
    for  (int i : m) {
        System.out.println(i);
    }
   }
}
