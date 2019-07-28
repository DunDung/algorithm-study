package baekjoon.exhaustive_search;

import java.util.Scanner;

//분해합
public class Q2231 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int size = String.valueOf(n).length(); // n의 자리수를 구하기 위한..
		int start = n - (9 * size); // 시작 최솟값 구하기
		int ans = 0;
		
		for(int i=start; i<n; i++) {
			int sum = i; //합
			int k = i; //한 자리씩 구하기 위한..
			while(k > 0) {
				sum += k%10;
				k /= 10;
			}
			if(sum == n) {
				ans = i;
				break;
			}
		}
		System.out.println(ans);
	}
}
