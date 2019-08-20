package baekjoon.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//내리막길
//X
public class Q1520 {
	public static int [][] a;
	public static int [][] d;
	public static int n;
	public static int m;
	public static int [] tx = {1, -1, 0, 0};
	public static int [] ty = {0, 0, 1, -1};

	public static int dfs(int x, int y) {
		if(x==0 && y==0) return 1;
		
		if(d[x][y] == -1) {
			d[x][y] = 0;
			for(int i=0; i<4; i++) {
				if(x+tx[i]>=0 && x+tx[i]<n && y+ty[i]>=0 && y+ty[i]<m) {
					if(a[x][y] < a[x+tx[i]][y+ty[i]]) {
						d[x][y] += dfs(x+tx[i], y+ty[i]);
					}
				}
			}
		}
		return d[x][y];
	}

	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(reader.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		a = new int[n][m];
		d = new int[n][m];

		for(int i=0; i<n; i++) {
			st = new StringTokenizer(reader.readLine());
			for(int j=0; j<m; j++) {
				a[i][j] = Integer.parseInt(st.nextToken());
				d[i][j] = -1;
			}
		}
		System.out.println(dfs(n-1, m-1));
	}
}