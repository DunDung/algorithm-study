package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1003 {
	static int oneCount = 0;
	static int zeroCount = 0;
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(reader.readLine());
		int [][] dp = new int [41][2];
		dp[0][0] = 1;
		dp[1][1] = 1;
		
		for(int i=2; i<41; i++)
			for(int j=0; j<2; j++)
				dp[i][j] = dp[i-1][j] + dp[i-2][j];
		for(int i=0;i<t; i++) {
			int n = Integer.parseInt(reader.readLine());
			System.out.println(dp[n][0]+" "+dp[n][1]);
		}
	}

}
