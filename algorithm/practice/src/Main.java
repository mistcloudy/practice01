
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {
    static int stoi(String s) { return Integer.parseInt(s);}
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int C = stoi(br.readLine());
        
        double sum = 0;
        double sum2 = 0;
        double div = 0;
        double div2 = 0;
        
        for(int i=0; i<C; i++) {
        	
        	String[] N = br.readLine().split(" ");
        
        	for (int j=0; j<Integer.parseInt(N[0]); j++) {
                  sum = sum + Integer.parseInt(N[j+1]);
        	}
        	div = sum/Integer.parseInt(N[0]);
        	sum = 0;
        	
        	for (int k=0; k<Integer.parseInt(N[0]); k++) {
      		 if (div<Integer.parseInt(N[k+1])) {
      			 sum2++;
      		 }
      	}
        	
        	div2 = sum2 / Integer.parseInt(N[0]) * 100;
        	sum2 = 0;

       	
        	sb.append(String.format("%.3f", div2) + "%" + "\n");
        	
        	N = null;
           
        }
        
        System.out.println(sb);
 
    }
}