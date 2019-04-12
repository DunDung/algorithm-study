package baekjoon.dp;

import java.util.Arrays;
import java.util.Scanner;

//가장 긴 감소하는 부분 수열
//O, 관련문제 풀고푼거라..
public class Q11722 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int []a = new int[n];
		int []dp = new int[n];
		
		for(int i=0; i<n; i++)
			a[i] = scan.nextInt();
		
		for(int i = 0; i<n; i++) {
			dp[i] = 1;
			for(int j=0; j<i; j++)
				if(a[i]<a[j] && dp[i] < dp[j]+1) 
					dp[i]++;
		}
		Arrays.sort(dp);
		
		System.out.println(dp[n-1]);
			
	}

}
