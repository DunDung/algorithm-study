package baekjoon.topological_sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

//ACM 크래프트
public class Q1005 {
	public static boolean [] visited;
	public static int target;
	public static int [] a;
	public static int max;

	public static void dfs(List<Integer>[] graph, int v, int result) {
		if(v == target) {
			max = Math.max(max, result);
			return;
		}
		for(int k : graph[v]) {
			dfs(graph, k, result+a[k]);
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(reader.readLine());
		StringBuilder sb = new StringBuilder();

		while(tc-- > 0) {
			StringTokenizer st = new StringTokenizer(reader.readLine());
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			visited = new boolean[n+1];
			List<Integer>[] graph = new ArrayList[n+1];
			for(int i=1; i<=n; i++) {
				graph[i] = new ArrayList<>();
			}
			a = new int[n+1];
			st = new StringTokenizer(reader.readLine());
			for(int i=1; i<=n; i++) {
				a[i] = Integer.parseInt(st.nextToken());
			}
			for(int i=0; i<m; i++) {
				st = new StringTokenizer(reader.readLine());
				int x = Integer.parseInt(st.nextToken());
				int y = Integer.parseInt(st.nextToken());
				graph[x].add(y);
			}
			target = Integer.parseInt(reader.readLine());
			max = 0;
			dfs(graph, 1, a[1]);
			sb.append(max+"\n");
		}
		System.out.print(sb.toString());
	}
}
