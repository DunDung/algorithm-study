package baekjoon.dp;

import java.util.Scanner;

//계단오르기
//X
public class Q2579 {
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int [] a = new int[n+1];
		int [] dp = new int[n+1];
		
		for(int i=1; i<=n; i++) 
			a[i] = scan.nextInt();
		
		dp[1] = a[1];
		dp[2] = a[1]+a[2]; 
		
		for(int i=3; i<=n; i++) 
			dp[i] = Math.max(dp[i-2]+a[i], dp[i-3]+a[i-1]+a[i]);
		System.out.println(dp[n]);
	
// 2차원으로 풀이
//		Scanner scan = new Scanner(System.in);
//		int n = scan.nextInt();
//		int [] a = new int[n+1];
//		int [][]dp = new int[n+1][2];
//
//		for(int i=1; i<=n; i++)
//			a[i] = scan.nextInt();
//		
//		dp[1][0] = a[1];
//		
//		for(int i=2; i<=n; i++) {
//			dp[i][0] = Math.max(dp[i-2][0],dp[i-2][1])+a[i]; //첫번째 계단인 경우
//			dp[i][1] = dp[i-1][0]+a[i]; //두번 째 계단인 경우
//		}
//		System.out.println(Math.max(dp[n][0],dp[n][1]));
	}
}
