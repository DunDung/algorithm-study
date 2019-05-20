package baekjoon.divide_and_conquer;

import java.util.Scanner;

//Z
//X
public class Q1074 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int r = scan.nextInt();
		int c = scan.nextInt();
		n = (int)Math.pow(2, n);
		int x = 0;
		int y = 0;
		int ans = 0;

		while(n > 1) {
			n /= 2;
			System.out.println(x+" "+y);
			// 1 왼쪽 위
			if(r < x+n && c < y+n) {
				//아무것도 추가하지 않는다.
			}
			// 2 오른쪽 위
			else if(r < x+n && c >= y+n) {
				ans += n * n * 1;
				y += n;
			}
			// 3 왼쪽 아래
			else if(r>= x+n && c < y+n) {
				ans += n * n * 2;
				x += n;
			}
			// 4 오른쪽 아래
			else {
				ans += n * n * 3;
				x += n;
				y += n;
			}
		}
		System.out.println(ans);
	}
}
