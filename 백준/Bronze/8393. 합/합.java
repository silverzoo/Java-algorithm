import java.io.*;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
        int result = 0;
        
        for(int i = 1; i <=num; i++) {
            result += i;
        }
        System.out.println(result);
        br.close();
	}
}

    
  