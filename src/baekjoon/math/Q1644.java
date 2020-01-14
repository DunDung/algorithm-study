package baekjoon.math;

import java.util.*;
import java.io.*;

// 소수의 연속합
// 20.01.15
public class Q1644 {
	static List<Integer> decimals = new ArrayList<>();

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		boolean[] isDecimal = new boolean[n+1];
		Arrays.fill(isDecimal, true);
		
		for (int i = 2; i * i <= n; i++) {
			if (isDecimal[i]) {
				for (int j = i + i; j <= n; j += i) {
					isDecimal[j] = false;
				}
			}
		}
		
		for (int i = 2; i <= n; i++) {
			if (isDecimal[i]) {
				decimals.add(i);
			}
		}
		
		int cnt = 0;
		for (int i = 0; i < decimals.size(); i++) {
			int sum = 0;
			for (int j = i; j < decimals.size(); j++) {
				sum += decimals.get(j);
				if (sum == n) {
					cnt++;
				} else if (sum > n) {
					break;
				}
			}
		}
		System.out.println(cnt);
	}
	
}