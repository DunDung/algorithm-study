package baekjoon.graph;

import java.util.Scanner;

//¿Ø±‚≥Û πË√ﬂ
public class Q1012 {
	static int[] dx = {1, -1, 0, 0};
	static int[] dy = {0, 0, 1, -1};
	
	static void dfs(int[][]a, int x, int y, int n, int m) {
		a[x][y] = 0;
		for(int i=0; i<4; i++) {
			if(x+dx[i]>=0 && x+dx[i]<n && y+dy[i]>=0 && y+dy[i]<m)
				if(a[x+dx[i]][y+dy[i]] == 1)
					dfs(a, x+dx[i], y+dy[i], n, m);
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int tc = scan.nextInt();
		
		while(tc-->0) {
			int m = scan.nextInt();
			int n = scan.nextInt();
			int k = scan.nextInt();
			int[][]a = new int[n][m];
			int cnt = 0;
			
			for(int i=0; i<k; i++) {
				int y = scan.nextInt();
				int x = scan.nextInt();
				a[x][y] = 1;
			}
			
			for(int i=0; i<n; i++) 
				for(int j=0; j<m; j++) 
					if(a[i][j] == 1) {
						dfs(a, i, j, n, m);
						cnt++;
					}
						
			System.out.println(cnt);
		}
	}

}
