package soma;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q3 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(reader.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int[] nums = new int[N];
		int[][] dp = new int[N][N];
		st = new StringTokenizer(reader.readLine());

		for (int i = 0; i < N; i++) {
			nums[i] = Integer.parseInt(st.nextToken());
		}

		for (int i = 0; i < N; i++) {
			for (int j = i; j < N; j++) {
				dp[i][j] = nums[j] - nums[i];

			}
		}
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < K/2  ; i++) {
			min = Math.min(dp[i][K - i] + dp[i][i] , min);

		}

		System.out.println(min);
	}
}
