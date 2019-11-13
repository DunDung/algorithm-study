package baekjoon.math;

import java.util.Scanner;

public class Q10870 {
	static int[] dp;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		dp = new int[n+1];
		System.out.println(fibonacci(n));
	}
	
	static int fibonacci(int n) {
		if(n==0) return 0;
		if(n==2 || n==1) return 1;
		if(dp[n]!=0) return dp[n];
		dp[n] = fibonacci(n-1)+fibonacci(n-2);
		return dp[n];
	}
}
