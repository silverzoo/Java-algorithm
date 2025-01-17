import java.io.*;
import java.util.*;

public class Main{

	static List<Integer>[] list;
	static int[] parent, depth;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine());
		for(int t=0; t<tc; t++) {
			int n = Integer.parseInt(br.readLine());
			
			parent = new int[n+1];
			depth = new int[n+1];
			list = new ArrayList[n+1];
			for(int i=1; i<n+1; i++) {
				list[i] = new ArrayList<>();
			}
			
			boolean[] rootCheck = new boolean[n+1];
			Arrays.fill(rootCheck, true);
			StringTokenizer st;
			for(int i=0; i<n-1; i++) {
				st = new StringTokenizer(br.readLine());
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				list[a].add(b);
				rootCheck[b] = false;
			}
			int rootIdx=0;
			for(int i=1; i<n+1; i++) {
				if(rootCheck[i]) {
					rootIdx =i; 
					break;
				}
			}
			
			init(rootIdx,1,0);
			
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			System.out.println(LCA(a,b));
		}
		
	}

	static void init(int cur, int h, int pa) {
		depth[cur] = h;
		parent[cur] = pa;
		for(int nxt : list[cur]) {
			if(nxt != pa) {
				init(nxt, h+1, cur);
			}
		}
	}
	
	static int LCA(int a, int b) {
		int ah = depth[a];
		int bh = depth[b];
		while(ah > bh) {
			a = parent[a];
			ah--;
		}
		
		while(bh > ah) {
			b = parent[b];
			bh--;
		}
		
		while(a!=b) {
			a = parent[a];
			b = parent[b];
		}
		
		return a;
	}
}