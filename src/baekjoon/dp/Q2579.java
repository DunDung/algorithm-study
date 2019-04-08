package baekjoon.dp;

import java.util.Scanner;

//계단오르기
//X
public class Q2579 {
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int [] array = new int[n];
		int [] dp = new int[n];
		
		for(int i=0; i<n; i++) 
			array[i] = scan.nextInt();
		
		dp[0] = array[0]; //첫번 째 계단
		dp[1] = Math.max(array[1], dp[0]+array[1]); //두번 째 계단은 첫번 째 계단만 또는 첫번 째 계단 + 두번 째 계단
		dp[2] = Math.max(array[0]+array[2], array[1]+array[2]); //세번 째 계단은 첫번째 계단 + 세번째 계단 
															//또는 두번 째 계단 + 세번 째 계단
		
		for(int i=3; i<n; i++) 
			dp[i] = Math.max(dp[i-2]+array[i], dp[i-3]+array[i-1]+array[i]);
			//전전 계단 + 지금 계단 또는 전전전 계단 +전 계단 + 지금 계단
		System.out.println(dp[n-1]);
	}
}
