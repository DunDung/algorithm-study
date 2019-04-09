package baekjoon.dp;

import java.util.Scanner;

//1, 2, 3 ¥ı«œ±‚
//X
public class Q9095 {
	
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		int [] dp = new int[11];
		
		dp[0] = 0;
		dp[1] = 1;
		dp[2] = 2;
		dp[3] = 4;
		for(int i=4; i<=10; i++) {
			dp[i] = dp[i-1]+dp[i-2]+dp[i-3];
		}
		
		for(int i=0; i<t; i++)
			System.out.println(dp[scan.nextInt()]);
	}

}
