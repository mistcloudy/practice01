import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main5 {
    static int stoi(String s) { return Integer.parseInt(s);}
	public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = stoi(br.readLine());
        String[] m = br.readLine().split("");          
        int sum = 0;

        for (int i=0; i<n; i++) {
            sum = sum + Integer.parseInt(m[i]);
        }
        System.out.println(sum);
	}
} 