import java.io.*;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());
        String str = br.readLine();
        int result = 0;
        
        for(int i=0; i<num; i++) {
            result += (str.charAt(i) - '0');
        }
        System.out.print(result);
	}
}