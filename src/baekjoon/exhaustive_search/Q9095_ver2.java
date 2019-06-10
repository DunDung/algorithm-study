package baekjoon.exhaustive_search;

import java.util.Scanner;

//1 2 3더하기
//백트레킹 사용
//X
public class Q9095_ver2 {
	static int go(int sum, int n) {
		if(sum > n)
			return 0;
		if(sum == n)
			return 1;
		int now = 0;
		for(int i=1; i<=3; i++) {
			now += go(sum+i, n);
		}
		return now;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int tc = scan.nextInt();
		
		while(tc-- > 0) {
			int n = scan.nextInt();
			System.out.println(go(0, n));
		}
	}
}
