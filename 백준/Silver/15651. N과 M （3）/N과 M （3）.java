import java.util.Scanner;
 
public class Main {
    
    public static int[] arr;
    public static int N, M;
    public static StringBuilder sb = new StringBuilder();
 
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
 
		N = sc.nextInt();
		M = sc.nextInt();
 
		arr = new int[M];
        
		dfs(0);
        System.out.print(sb);
 
	}
 
	public static void dfs(int depth) {

		if (depth == M) {
			for (int i = 0; i < M; i++) {
                sb.append(arr[i] + " ");
			}
            sb.append("\n");
			return;
		}
 
		for (int i = 1; i <= N; i++) {
			arr[depth] = i;
			dfs(depth + 1);
		}
	}
 
}