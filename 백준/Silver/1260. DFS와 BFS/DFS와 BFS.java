import java.util.*;
import java.io.*;

public class Main {
	static int edge[][];
	static boolean visited[];
	static int n, m, v, cnt;
	static Queue<Integer> que = new LinkedList<>();

	public static void BFS(int start) {
		que.offer(start);	
		visited[start] = true;
		System.out.print(start + " ");

		while( !que.isEmpty() ) {
			start = que.poll();

			for(int i = 1; i <= n; i++) {
				if(edge[start][i] == 1 && visited[i] == false) {
					que.offer(i);
					visited[i] = true;
					System.out.print(i + " ");
				}
			}
		}	
	}

	public static void DFS(int start) {
		visited[start] = true;
		System.out.print(start + " ");

        if(cnt == n) {
			return;
		}
		cnt++;

		for(int i = 1; i <= n; i++) {
			if(edge[start][i] == 1 && visited[i] == false) {
				DFS(i);
			}
		}
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;

		st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		v = Integer.parseInt(st.nextToken());

		edge = new int[1001][1001];
		visited = new boolean[1001];

		for(int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());

			edge[x][y] = edge[y][x] = 1;
		}

		DFS(v);
		System.out.println();

		visited = new boolean[1001];
		BFS(v);
	
	} 
}