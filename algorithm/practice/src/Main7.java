import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main7 {
    static int stoi(String s) { return Integer.parseInt(s);}
	public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringBuilder sb = new StringBuilder();
      int t = stoi(br.readLine());
        for (int i = 0; i<t; i++){
            String[] m = br.readLine().split(""); 
            for (int j = 2; j<m.length; j++){
                for (int k=0; k<Integer.parseInt(m[0]); k++ ){
                    sb.append(m[j]);
                }    
            }
            sb.append("\n");
        }
            System.out.print(sb);
        }
	}
