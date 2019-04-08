package baekjoon.dp;

import java.util.Scanner;

//쉬운 계단 수
public class Q10844 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int [] dp = new int[n+1];
		
		dp[1] = 9;
		dp[2] = 17;
		
		for(int i=3; i<=n; i++) 
			dp[i] = (dp[i-1]*2)-(i-1);

		System.out.println(dp[n]%1000000000);

		scan.close();
	}
}
