import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int countN = Integer.parseInt(br.readLine());
        int result = 0;
        int[] arr = new int[countN];

        StringTokenizer st = new StringTokenizer(br.readLine());;

        for(int i = 0; i < countN; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int findN = Integer.parseInt(br.readLine());

        for(int i = 0; i < arr.length; i++){
            if(findN == arr[i]) {
                result++;
            }
        }
        System.out.println(result);
        br.close();
    }
}