package dp;

import java.util.Arrays;
import java.util.Scanner;

//정수 삼각형
//O
//누적합을 사용

public class Q1932 {
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int [][] dp = new int [n][ ];

		for(int i=0; i<n; i++) {
			dp[i] = new int[i+1];
			for(int j=0; j<=dp[i].length; j++) 
				dp[i][j] = scan.nextInt();
		}

		for(int i=1; i<n; i++) 
			for(int j=0; j<dp[i].length; j++) {
				if(j-1<0)
					dp[i][j] += dp[i-1][j];
				else if(j>=dp[i-1].length)
					dp[i][j] += dp[i-1][j-1];
				else
					dp[i][j] += Math.max(dp[i-1][j], dp[i-1][j-1]);
			}
		
		Arrays.parallelSort(dp[n-1]);
		System.out.println(dp[n-1][n-1]);
	}
}
