package baekjoon.graph;

import java.util.Arrays;
import java.util.Scanner;

//적록색약
public class Q10026 {
	static int dx[] = {1, -1, 0, 0};
	static int dy[] = {0, 0, -1, 1};
	static int n;
	
	static void dfs1(int [][] a, int value, int x, int y) {
		a[x][y] = 0;
		for(int i=0; i<4; i++) {
			if(x+dx[i]>=0 && x+dx[i]<n && y+dy[i]>=0 && y+dy[i]<n) {
				if(a[x+dx[i]][y+dy[i]]==value)
					dfs1(a, value, x+dx[i], y+dy[i]);
			}
		}
	}
	static void dfs2(int [][] a, int value, int x, int y) {
		a[x][y] = 0;
		for(int i=0; i<4; i++) {
			if(x+dx[i]>=0 && x+dx[i]<n && y+dy[i]>=0 && y+dy[i]<n) {
				if(value == 1 || value == 2) {
					if(a[x+dx[i]][y+dy[i]]== 1 || a[x+dx[i]][y+dy[i]]== 2)
						dfs2(a, value, x+dx[i], y+dy[i]);
				}
				else {
					if(a[x+dx[i]][y+dy[i]] == value)
						dfs2(a, value, x+dx[i], y+dy[i]);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		int [][] a = new int[n][n];
		int [][] b = new int[n][n];
		
		for(int i=0; i<n; i++) {
			String s = scan.next();
			for(int j=0; j<n; j++) {
				if(s.charAt(j)=='R') {
					a[i][j] = 1;
					b[i][j] = 1;
				}
				else if(s.charAt(j)=='G') {
					a[i][j] = 2;
					b[i][j] = 2;
				}
				else {
					a[i][j] = 3;
					b[i][j] = 3;
				}
			}	
		}
		
		
		int cnt1 = 0;
		int cnt2 = 0;
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(b[i][j]>0) {
					cnt1 ++;
					dfs1(b, b[i][j], i, j);
				}
			}
		}
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(a[i][j]>0) {
					cnt2 ++;
					dfs2(a, a[i][j], i, j);
				}
			}
		}
		System.out.println(cnt1+" "+cnt2);
		
	}

}
