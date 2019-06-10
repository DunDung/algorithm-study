package baekjoon.exhaustive_search;

import java.util.Scanner;

//1 2 3더하기
//백트레킹 사용
public class Q9095_ver2 {
	static int go(int cnt, int sum, int goal) {
		System.out.println(cnt+" "+sum);
		if(sum > goal)
			return 0;
		if(sum == goal)
			return 1;
		int now = 0;
		for(int i=1; i<=3; i++) {
			now += go(cnt+1, sum+i, goal);
		}
		return now;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int tc = scan.nextInt();
		
		while(tc-- > 0) {
			int n = scan.nextInt();
			System.out.println(go(0, 0, n));
		}
	}

}
