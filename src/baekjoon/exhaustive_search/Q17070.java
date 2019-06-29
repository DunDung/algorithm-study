package baekjoon.exhaustive_search;

import java.util.Scanner;

//파이프 옮기기 1
public class Q17070 {
	
	public static int n ;
	public static int ans = 0 ;
	public static int [][] a;

	public static void dfs(int x, int y, int state) {
		if(x==n-1 && y==n-1) {
			ans++;
			return;
		}
		if(y+1<n && x+1<n) {
			if(a[x][y+1]==0 && a[x+1][y]==0 && a[x+1][y+1]==0) {
				dfs(x+1, y+1, 2);
			}
		}
		if(state == 0) { //가로
			if(y+1<n && a[x][y+1]==0) {
				dfs(x, y+1, 0);
			}
		} else if(state == 1) {
			if(x+1<n && a[x+1][y]==0) {
				dfs(x+1, y, 1);
			}
		} else {
			if(y+1<n && a[x][y+1]==0) {
				dfs(x, y+1, 0);
			}
			if(x+1<n && a[x+1][y]==0) {
				dfs(x+1, y, 1);
			}

		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		a = new int[n][n];
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				a[i][j] = scan.nextInt();
			}
		}
		dfs(0, 1, 0);
		System.out.println(ans);

	}

}
