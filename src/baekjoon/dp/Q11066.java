package baekjoon.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//파일 합치기
public class Q11066 {

	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(reader.readLine());
		while(tc-- > 0) {
			int n = Integer.parseInt(reader.readLine());
			int [] a = new int[n+1];
			int [] dp = new int[n+1];
			StringTokenizer st = new StringTokenizer(reader.readLine());
			for(int i=1; i<=n; i++) {
				a[i] = Integer.parseInt(st.nextToken());
			}
			dp[1] = a[1];
			dp[2] = a[1]+a[2];
			for(int i=3; i<=n; i++) {
				dp[i] = Math.min((dp[i-1]*2)+a[i], (a[i-1]+a[i])*2 + dp[i-2]);
			}
			System.out.println(dp[3]);
		}
	}

}
