package baekjoon.dp;

import java.util.Scanner;

//포도주 시식
//X
public class Q2156 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int [] a = new int[n+1];
		int [] dp = new int[n+1];
		
		for(int i=1; i<=n; i++)
			a[i] = scan.nextInt();
		
		dp[1] = a[1];
		if(n>1)
			dp[2] = a[1]+a[2];
		
		for(int i=3; i<=n; i++) {
			dp[i] = Math.max(dp[i-1], Math.max(dp[i-2]+a[i], dp[i-3]+a[i-1]+a[i]));
		}
		
		System.out.println(dp[n]);
	}

}
