package baekjoon.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

//µ¿Àü1
//X
public class Q2293 {

	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(reader.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int[] coins = new int[n+1];
		int[] dp = new int[k+1];
		dp[0] = 1;
		for(int i=1; i<=n; i++) {
			coins[i] = Integer.parseInt(reader.readLine());
		}
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=k; j++) {
				if(j >= coins[i]) {
					dp[j] += dp[j-coins[i]];
				}
			}
			System.out.println(Arrays.toString(dp));
		}
		System.out.println(dp[k]);
	}

}
