package baekjoon.exhaustive_search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Q14889 {
	public static int [][] a;
	public static int n;
	public static int ans = Integer.MAX_VALUE;
	public static boolean [] team = new boolean[21];

	public static void go(int k, int cnt) {
		if(n/2 == cnt) {
			calculation();
		} else {
			for(int i=k; i<=n; i++) {
				if(!team[i]) {
					team[i] = true;
					go(i, cnt+1);
					
				}
			}
		}
		team[k-1] = false;
	}
	
	public static void calculation() {
		int start = 0;
		int link = 0;

		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				if(i==j) continue;
				if(team[i] && team[j]) {
					start += a[i][j];
				} else if(!team[i] && !team[j]) {
					link += a[i][j];
				}
			}
		}

		ans = Math.min(ans, Math.abs(start-link));
	}

	public static void main(String[] args) throws IOException  {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(reader.readLine());
		a = new int[n+1][n+1];
		for(int i=1; i<=n; i++) {
			StringTokenizer st = new StringTokenizer(reader.readLine());
			for(int j=1; j<=n; j++) {
				a[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		go(1, 0);
		

		System.out.print(ans);
	}
}