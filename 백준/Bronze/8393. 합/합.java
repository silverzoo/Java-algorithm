import java.io.*;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
        int result = 0;
           
        while(num > 0) {
            result += num;
            num--;
        }
        
        System.out.println(result);
        br.close();
	}
}

    
  