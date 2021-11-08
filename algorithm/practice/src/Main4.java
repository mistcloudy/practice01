import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main4 {
 
	public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        String[] ar = br.readLine().split(" ");
        String[] arr = br.readLine().split(" ");
        int sum = 0;
        int result = 0; 
        for(int i=0; i<(Integer.parseInt(ar[0]))-2; i++){
           for(int j=i+1; j<(Integer.parseInt(ar[0]))-1; j++){
               for(int k=j+1; k<(Integer.parseInt(ar[0])); k++){
                sum = Integer.parseInt(arr[i]) +Integer.parseInt(arr[j])+ Integer.parseInt(arr[k]);
                if (sum <= (Integer.parseInt(ar[1]))) {
                    if (result < sum) {
                    result = sum;
                    }
                }
               }
           }
        }
        System.out.println(result);
	}
} 