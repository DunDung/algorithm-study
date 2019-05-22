package baekjoon.dp;

import java.util.Arrays;
import java.util.Scanner;

//줄 세우기
//가장 긴 증가하는 부분수열 알고리즘으로 해결하기
//X
public class Q2631 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int [] a = new int[n+1];
		int [] dp = new int[n+1];
		
		for(int i=1; i<=n; i++)
			a[i] = scan.nextInt();
		
		for(int i=1; i<=n; i++) {
			dp[i] = 1;
			for(int j=1; j<i; j++) {
				if(a[i] > a[j] && dp[i]<=dp[j]) {
					dp[i] = dp[j]+1;
				}
			}
		}
		Arrays.sort(dp);
		System.out.println(n-dp[n]);
		
	}

}
