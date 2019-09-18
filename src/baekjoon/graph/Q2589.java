package baekjoon.graph;

import java.io.*;
import java.util.*;

//º¸¹°¼¶
public class Q2589 {
	static int n,m;
	static char[][] map;
	static int max;
	static boolean[][] visited;
	static int[][] dist;
	static int[] tx = {1, -1, 0, 0};
	static int[] ty = {0, 0, 1, -1};
	
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(reader.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		map = new char[n][m];

		for(int i=0; i<n; i++) {
			String input = reader.readLine();
			for(int j=0; j<m; j++) {
				map[i][j] = input.charAt(j);
			}
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				if(map[i][j]=='L') {
					visited = new boolean[n][m];
					dist = new int[n][m];
					bfs(i, j);
				}
			}
		}
		System.out.println(max);
	}
	static void bfs(int i, int j) {
		visited[i][j] = true;
		Queue<Integer> q = new LinkedList<>();
		q.add(i*m+j);
		
		while(!q.isEmpty()) {
			int v = q.poll();
			int r = v/m;
			int c = v%m;
			for(int k=0; k<4; k++) {
				if(r+tx[k]>=0 && r+tx[k]<n && c+ty[k]>=0 && c+ty[k]<m) {
					if(!visited[r+tx[k]][c+ty[k]] &&  map[r+tx[k]][c+ty[k]]=='L') {
						visited[r+tx[k]][c+ty[k]] = true;
						dist[r+tx[k]][c+ty[k]] = dist[r][c]+1;
						max = Math.max(max, dist[r+tx[k]][c+ty[k]]);
						q.add((r+tx[k])*m+(c+ty[k]));
					}
				}
			}
		}
		
	}
}
