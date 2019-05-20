package baekjoon.divide_and_conquer;

import java.util.Scanner;

//쿼드트리
//X
//문제이해도 못했었다..
//종이의 개수와 유사한 문제
public class Q1992 {

	static void solve(int[][]a, int n, int x, int y) {
		boolean isOk = true;
		loop:
			for(int i=0; i<n; i++) {
				for(int j=0; j<n; j++) {
					if(a[x][y] != a[x+i][y+j]) {
						isOk = false;
						break loop;
					}
				}
			}
		if(isOk)
			System.out.print(a[x][y]);
		else {
			System.out.print("(");
			n/=2;
			for(int i=0; i<2; i++) { //배열을 분할할 때 이부분을 기억하자.
				for(int j=0; j<2; j++) {
					solve(a, n, x+i*n, y+j*n);
				}
			}
				System.out.print(")");
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int [][] a = new int[n][n];

		for(int i=0; i<n; i++) {
			String s = scan.next();
			for(int j=0; j<n; j++) {
				a[i][j] = s.charAt(j)-'0';
			}
		}
		solve(a, n, 0, 0);
	}
}
