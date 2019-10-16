package baekjoon.graph;

import java.util.*;
import java.io.*;

//경로 찾기
public class Q11403 {
	static int n;
	static int[][] map ;
	static int[][] result ;
	static boolean[] visited;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		map = new int[n][n];
		result = new int[n][n];
		visited = new boolean[n];
		
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=0; j<n; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				Arrays.fill(visited, false);
				dfs(i, j, 0, visited);
				if(visited[j]) result[i][j] = 1;
			}
		}
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.print(result[i][j]+" ");
			}
			System.out.println();
		}

	}
	public static void dfs(int start, int target, int cnt, boolean[] visited) {
		if(start == target && cnt > 0) return;
		for(int i=0; i<n; i++) {
			if(map[start][i] > 0) {
				if(!visited[i]) {
					visited[i] = true;
					dfs(i, target, cnt+1, visited);
				}
			}
		}
	}
}