import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main6 {
	public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
        String[] m = br.readLine().split(""); 
        String[] n = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        int count = 0;

        all: for (int i=0; i<n.length; i++) {
            for (int j=0; j<m.length; j++){
                if (n[i].equals(m[j])){
                    count = j;
                    System.out.print(count + " ");
                    continue all;
                } 
            }
            System.out.print(-1 + " ");
        }
	}
} 