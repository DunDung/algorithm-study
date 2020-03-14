package baekjoon.exhaustive_search;

import java.io.*;
import java.util.*;

class Q13908 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine());
		List<Integer> numbers = new ArrayList<>();

		for (int i = 0; i < N; i++) {
			numbers.add(Integer.parseInt(st.nextToken()));
		}

		int ans = 0;

		while (N >= K) {
			ans += N / K;
			N = (N / K) + (N % K);
		}
		
		if (N > 1) {
			ans += 1;
		}
		
		System.out.println(ans);
	}
}