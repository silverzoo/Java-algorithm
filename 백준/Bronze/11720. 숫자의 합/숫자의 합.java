import java.io.*;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        	int num = Integer.parseInt(br.readLine());
        	String str = br.readLine();
        	int result = 0;
        
	        for(int i=0; i<num; i++) {
	            result += (str.charAt(i) - '0');
	        }
		bw.write(result+"\n");   // "\n" 하지않으면 틀린답이 됨. bw.write(result) bw.newLine() 이어도 오답임. 왜?
		bw.flush();
		bw.close();
		br.close();
	}
}
