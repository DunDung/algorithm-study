package baekjoon.dp;

import java.util.Scanner;

//오르막 수
//O!
public class Q11057 {

	public static void main(String[] args) {
		final int mod = 10007;
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		long [][] dp = new long[n+1][10];

		for(int i=0; i<10; i++)
			dp[1][i] = 1;

		for(int i=2; i<=n; i++) {
			for(int j=0; j<10; j++) {
				for(int k=j; k<10; k++) {
					dp[i][j] += dp[i-1][k];
					dp[i][j] %= mod;
				}
			}
		}
		long answer = 0;
		for(int i=0; i<10; i++)
			answer += dp[n][i];

		System.out.println(answer%mod);
	}
}
