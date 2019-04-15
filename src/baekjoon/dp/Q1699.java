package baekjoon.dp;

import java.util.Arrays;
import java.util.Scanner;

//Á¦°ö¼öÀÇ ÇÕ
public class Q1699 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int [] dp = new int[n+1];
		
		for(int i=1; i<=n; i++) {
			dp[i] = i;
			for(int j=1; j*j <= i; j++) 
				if(dp[i] > dp[i-j*j]+1)
					dp[i] = dp[i-j*j]+1;
		}
		System.out.println(Arrays.toString(dp));
		System.out.println(dp[n]);
	}

}
