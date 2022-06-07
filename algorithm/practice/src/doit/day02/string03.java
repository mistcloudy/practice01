package doit.day02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class string03 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] r = br.readLine().split("");
        int t = 0;
        for (int i = 0; i < r.length; i++) {
            switch (r[i]) {
                case "A":
                    t = t + 3;
                    break;
                case "B":
                    t = t + 3;
                    break;
                case "C":
                    t = t + 3;
                    break;
                case "D":
                    t = t + 4;
                    break;
                case "E":
                    t = t + 4;
                    break;
                case "F":
                    t = t + 4;
                    break;
                case "G":
                    t = t + 5;
                    break;
                case "H":
                    t = t + 5;
                    break;
                case "I":
                    t = t + 5;
                    break;
                case "J":
                    t = t + 6;
                    break;
                case "K":
                    t = t + 6;
                    break;
                case "L":
                    t = t + 6;
                    break;
                case "M":
                    t = t + 7;
                    break;
                case "N":
                    t = t + 7;
                    break;
                case "O":
                    t = t + 7;
                    break;
                case "P":
                    t = t + 8;
                    break;
                case "Q":
                    t = t + 8;
                    break;
                case "R":
                    t = t + 8;
                    break;
                case "S":
                    t = t + 8;
                    break;
                case "T":
                    t = t + 9;
                    break;
                case "U":
                    t = t + 9;
                    break;
                case "V":
                    t = t + 9;
                    break;
                case "W":
                    t = t + 10;
                    break;
                case "X":
                    t = t + 10;
                    break;
                case "Y":
                    t = t + 10;
                    break;
                case "Z":
                    t = t + 10;
                    break;
            }
        }

        System.out.println(t);
    }
}
