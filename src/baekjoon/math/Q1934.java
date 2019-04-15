package baekjoon.math;

import java.util.Scanner;

//최소공배수
public class Q1934 {
	static int gcd(int a, int b) {
		if(b==0)
			return a;
		return gcd(b, a%b);
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int tc = scan.nextInt();
		
		for(int t=0; t<tc; t++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			System.out.println(a*b/gcd(a, b));
		}
	}

}
