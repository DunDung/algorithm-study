package baekjoon.math;

import java.util.Scanner;

// 3ÀÇ ¹è¼ö
// 2019.12.20
public class Q16561 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int ans = 0;
		
		for (int i = 3; i - 6 <= n; i += 3) {
			for (int j = 3; j + i - 3 <= n; j += 3) {
				for (int k = 3; k + j + i <= n; k += 3) {
					if(i + j + k == n) {
						ans++;
					}
				}
			}
		}
		
		System.out.println(ans);
	}

}
