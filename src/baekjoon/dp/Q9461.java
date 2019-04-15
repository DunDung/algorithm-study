package baekjoon.dp;

import java.util.Arrays;
import java.util.Scanner;

//파도반 수열
//X
public class Q9461 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int tc = scan.nextInt();
		long [] dp = {0, 1, 1, 1, 2, 2, 3, 4, 5, 7, 9};
		dp = Arrays.copyOf(dp, 101);
		
		for(int i=10; i<=100; i++)
			dp[i] = dp[i-5]+dp[i-1];
		
		for(int t=0; t<tc; t++)
			System.out.println(dp[scan.nextInt()]);
		
	}
}
