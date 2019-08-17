package baekjoon.dp;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//평범한 배낭
//X
public class Q12865 {

	public static void main(String[] args) throws Exception{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(reader.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int[][] dp = new int[k+1][n+1]; //가방의 크기가 i일때 j번째 물건까지 담을 경우 최대가치
		int [] w = new int[n+1];
		int [] v = new int[n+1];

		for(int i=1; i<=n; i++) {
			st = new StringTokenizer(reader.readLine());
			w[i] = Integer.parseInt(st.nextToken());
			v[i] = Integer.parseInt(st.nextToken());
		}

		for(int i=1; i<=k; i++) {
			for(int j=1; j<=n; j++) {
				if(i >= w[j]) {
					//남는 무게의 가치를 추가할 때 같은 물건을 추가하면 안되므로 j-1
					//같은 물건을 제외하고 가치가 높을 때가 j-1이다.
				    dp[i][j] = Math.max(dp[i][j-1], dp[i-w[j]][j-1]+v[j]); 
				} else {
					dp[i][j] = dp[i][j-1];
				}
			}
		}
		System.out.println(dp[k][n]);
	}
}
/*
 * 4 6
 * 6 13
 * 3 8
 * 7 15
 * 2 6
 */
