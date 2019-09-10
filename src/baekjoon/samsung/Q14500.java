package baekjoon.samsung;

import java.io.*;
import java.util.*;

//테트로미노
public class Q14500 {
	static int n;
	static int m;
	static int[][] a;
	static int[] tx = {1, -1, 0, 0};
	static int[] ty = {0, 0, 1, -1};
	static int max = 0;
	static boolean[] visited;

	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(reader.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		a = new int[n][m];
		visited = new boolean[n*m];
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(reader.readLine());
			for(int j=0; j<m; j++) {
				a[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		for(int i=0; i<n*m; i++) {
			int r = i/m;
			int c = i%m;
			visited[i] = true;
			dfs(i, a[r][c], 0, visited);
			Arrays.fill(visited, false);
		}
		System.out.println(max);
	}
	static void dfs(int idx, int sum, int cnt, boolean[] visited) {
		if(cnt==3) {
			max = Math.max(max, sum);
			return;
		}
		int r = idx/m;
		int c = idx%m;
		for(int i=0; i<4; i++) {
			if(r+tx[i]>=0 && r+tx[i]<n && c+ty[i]>=0 && c+ty[i]<m) {
				if(!visited[(r+tx[i])*m+c+ty[i]]) {
					visited[(r+tx[i])*m+c+ty[i]] = true;
					dfs((r+tx[i])*m+c+ty[i], sum+a[r+tx[i]][c+ty[i]], cnt+1, visited);
					visited[(r+tx[i])*m+c+ty[i]] = false;
				}
			}
		}
	}
}
