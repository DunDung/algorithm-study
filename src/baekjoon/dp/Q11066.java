package baekjoon.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//파일 합치기
//X
public class Q11066 {

	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(reader.readLine());
		while(tc-- > 0) {
			int n = Integer.parseInt(reader.readLine());
			int [] a = new int[n];
			int [][] dp = new int[n][n];
			StringTokenizer st = new StringTokenizer(reader.readLine());
			for(int i=0; i<=n; i++) {
				a[i] = Integer.parseInt(st.nextToken());
			}
			for(int i=1; i<n; i++) {
				for(int j=0; j<n-i; j++) {
					dp[j][j+i] = Integer.MAX_VALUE;
					for(int k=0; k<i; k++) {
						int cost = dp[j][j+k] + dp[j+k+1][j+i] + a[j]+
					}
				}
			}
		}
	}

}
