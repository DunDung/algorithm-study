package baekjoon.dp;

import java.util.Arrays;
import java.util.Scanner;

//줄 세우기
//연속적으로 증가하는 긴 증가수열 구하기

public class Q7570 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int [] dp = new int[n+1];
		
		for(int i=0; i<n; i++) {
			int k = scan.nextInt();
			dp[k] = dp[k-1]+1;
		}
		
		Arrays.sort(dp);
		System.out.println(n-dp[n]);
		
	}

}
