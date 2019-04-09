package baekjoon.dp;
import java.util.Scanner;

//1로만들기
//X
public class Q1463 {
//	static int oneCreate(int n, int[] dp) {
//		if(n==1) return 0;
//		if(dp[n] > 0) return dp[n];
//		dp[n] = oneCreate(n-1, dp) + 1;
//		if(n%2 == 0) 
//			dp[n] = Math.min(dp[n], oneCreate(n/2, dp)+1);
//		if(n%3 == 0)
//			dp[n] = Math.min(dp[n], oneCreate(n/3, dp)+1);
//		return dp[n];
//	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int [] dp = new int [n+1];
		
//		System.out.println(oneCreate(n, dp));
		dp[0] = 0;
		dp[1] = 0;
		
		for(int i=2; i<=n; i++) {
			dp[i] = dp[i-1]+1; //n이 나누어떨어지는 것과 관계없는 n-1을 일단 dp[i]에 넣어둔다.
			if(i%2 == 0) dp[i] = Math.min(dp[i/2]+1, dp[i]); 
			if(i%3 == 0) dp[i] = Math.min(dp[i/3]+1, dp[i]);
		}
		System.out.println(dp[n]);
	}
}
