package baekjoon.exhaustive_search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

//±∏ΩΩ≈ª√‚
public class Q13460 {
	public static int n;
	public static int m;
	public static char [][] a;
	public static int [] tx = {0, 0, 1, -1};
	public static int [] ty = {1, -1, 0, 0};
	public static int ans = Integer.MAX_VALUE;
	public static Queue<Circle> q = new LinkedList<>();

	public static void dfs(int k, int x, int y, int cnt, boolean red, boolean blue, boolean [][] visited) {
		System.out.println(x+" "+y+" "+cnt+ " "+red+" "+blue);
		if(cnt > 10) return;
		if(a[x][y]=='B') blue = true;
		if(a[x][y]=='R') red = true;
		if(a[x][y] == '#') {
			if(!blue && red) {
				ans = Math.min(ans, cnt);
			}
			return;
		}
		for(int i=0; i<4; i++) {
			if(x+tx[i]>=0 && x+tx[i]<n && y+ty[i]>=0 && y+ty[i]<m) {
				if(!visited[x+tx[i]][y+ty[i]]) {
					visited[x+tx[i]][y+ty[i]] = true;
					if(k!=i) {
						dfs(i, x+tx[i], y+ty[i], cnt+1, red, blue, visited);
					} else {
						dfs(i, x+tx[i], y+ty[i], cnt, red, blue, visited);
					}
				}
			}
		}
	}
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String [] input = reader.readLine().split(" ");
		n = Integer.parseInt(input[0]);
		m = Integer.parseInt(input[1]);
		a = new char [n][m];
		boolean [][] visited = new boolean[n][m];
		int x = 0;
		int y = 0;
		for(int i=0; i<n; i++) {
			String s = reader.readLine();
			for(int j=0; j<m; j++) {
				a[i][j] = s.charAt(j);
				if(a[i][j] == 'O') {
					x=i;
					y=j;
				}
			}
		}
		for(int i=0; i<4; i++) {
			if(x+tx[i]>=0 && x+tx[i]<n && y+ty[i]>=0 && y+ty[i]<m) {
				if(a[x+tx[i]][y+ty[i]]!='#') {
					dfs(i, x+tx[i], y+ty[i], 1, false, false, visited);
				}
			}
		}


		if(ans == Integer.MAX_VALUE) {
			System.out.println(-1);
		} else {
			System.out.println(ans);
		}
	}
}
class Circle{
	int x;
	int y;
	public Circle(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
