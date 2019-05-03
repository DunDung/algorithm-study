package baekjoon.dp;

import java.util.Scanner;

//다리 놓기
//X
public class Q1010 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int tc = scan.nextInt();
		while(tc-->0) {
			int n = scan.nextInt();
			int m = scan.nextInt();
			int [][] dp = new int[n+1][m+1];
			
			for(int i=1; i<=m; i++)
				dp[1][i] = i;
			
			for(int i=2; i<=n; i++) {
				for(int j=i; j<=m; j++) {
					for(int k=j; k>=i; k--)
						dp[i][j] += dp[i-1][k-1];
				}
			}
			System.out.println(dp[n][m]);
		}
	}

}
