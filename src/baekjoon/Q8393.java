package baekjoon;

import java.util.Scanner;

public class Q8393 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		if(n >= 1 && n<=10000) {
			System.out.println(sum(n));
		}
	}
	
	public static int sum(int n) {
		if(n<=0)
			return 0;
		else {
			return n+sum(n-1);
		}
	}
}
