package baekjoon.dp;

import java.util.Arrays;
import java.util.Scanner;

//¿¬¼ÓÇÕ
//X
public class Q1912 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int [] a = new int[n];
		int [] dp = new int[n];

		for(int i=0; i<n; i++) 
			a[i] = scan.nextInt();

		dp[0] = a[0];
		for(int i=1; i<n; i++)
			dp[i] = Math.max(dp[i-1]+a[i], a[i]);
		
		Arrays.sort(dp);
		System.out.println(dp[n-1]);
	}
}
