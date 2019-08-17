package baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//P¹è¿­
public class Q1566 {
	public static int n;
	public static int m;
	public static boolean [] visited;
	public static int[][]a;
	public static int ans = Integer.MAX_VALUE;

	public static boolean isP(int v) {

		for(int i=0; i<n; i++) {
			int sumRow = 0;
			int sumCol = 0;
			for(int j=0; j<m; j++) {
				if(v<n && v==i) {
					a[v][j]*= -1;
				}
				if(v>=n && v-n==i) {
					a[j][v-n]*= -1;
				}
				sumRow+=a[i][j];
				sumCol+=a[j][i];
			}
			if(sumRow<0 || sumCol<0) {
				return false;
			}
		}
		return true;
	}

	public static void backtrack(int cnt) {
		for(int i=0; i<n+m; i++) {
			if(!visited[i]) {
				visited[i] = true;
				if(isP(i)) {
					ans = Math.min(ans, cnt);
				}
				backtrack(cnt+1);
				if(isP(i)) {
					ans = Math.min(ans, cnt);
				}
				visited[i] = false;
			}
		}
	}
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String [] input = reader.readLine().split(" ");
		n = Integer.parseInt(input[0]);
		m = Integer.parseInt(input[1]);
		a = new int[n][m];
		visited = new boolean[n+m];

		for(int i=0; i<n; i++) {
			input = reader.readLine().split(" ");
			for(int j=0; j<m; j++) {
				a[i][j] = Integer.parseInt(input[j]);
			}
		}
		boolean isOk = true;
		for(int i=0; i<n; i++) {
			int sumRow = 0;
			int sumCol = 0;
			for(int j=0; j<m; j++) {
				sumRow+=a[i][j];
				sumCol+=a[j][i];
			}
			if(sumRow<0 || sumCol<0) {
				isOk = false;
			}
		}
		if(isOk) {
			System.out.println(0);
		} else {
			backtrack(1);
			if(ans == Integer.MAX_VALUE) {
				System.out.println(-1);
			} else {
				System.out.println(ans);
			}
		}
	}

}
