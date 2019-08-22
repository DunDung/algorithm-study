package baekjoon.binary_search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//k¹øÂ° ¼ö
//X
public class Q1300 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int k = Integer.parseInt(br.readLine());
		int left = 1;
		int right = k;
		int ans = 0;
		while (left <= right) {
			int mid = (left + right) / 2;
			int cnt = getCnt(mid, n);
			if (cnt >= k) {
				ans = mid;
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}
		System.out.println(ans);
	}

	static int getCnt(int x, int n) {
		int cnt = 0;
		for (int i = 1; i <= n; i++) {
			cnt += Math.min(x / i, n);
		}
		return cnt;
	}
}