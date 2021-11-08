
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main2 {
    static long stoi(String s) { return Long.parseLong(s);}
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long n = stoi(br.readLine());
        
        long sum = 0;
        
        	String[] a = br.readLine().split(" ");
        
        	for (int j=0; j<n; j++) {
                  sum = sum + Long.parseLong(a[j]);
        	}	
      	
        
        System.out.println(sum);
 
    }
}