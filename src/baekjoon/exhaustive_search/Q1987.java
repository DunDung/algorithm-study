package baekjoon.exhaustive_search;

import java.util.Scanner;

//¾ËÆÄºª
public class Q1987 {
	public static int [] dx = {1, -1, 0, 0};
	public static int [] dy = {0, 0, 1, -1};
	public static int max = 0;
	public static int n = 0;
	public static int m = 0;
	public static boolean[] b = new boolean[26];
	
	public static void go(char[][]c, int cnt, int x, int y) {
		b[c[x][y]-'A'] = true;
		
		boolean ok = false;
		for(int k=0; k<4; k++) {
			if(x+dx[k] >= 0 && x+dx[k]<n && y+dy[k]>=0 &&y+dy[k]<m) {
				if(!b[c[x+dx[k]][y+dy[k]]-'A']) {
					b[c[x+dx[k]][y+dy[k]]-'A'] = true;
					ok = true;
					go(c, cnt+1, x+dx[k], y+dy[k]);
					b[c[x+dx[k]][y+dy[k]]-'A'] = false;
				}
			}
		}
		if(!ok)
			max = Math.max(max, cnt);
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		m = scan.nextInt();
		char [][]c = new char[n][m];
		
		scan.nextLine();
		for(int i=0; i<n; i++) {
			String s = scan.nextLine();
			for(int j=0; j<m; j++)
				c[i][j] = s.charAt(j);
		}
		go(c, 1, 0, 0);
		System.out.println(max);
		
	}
}
