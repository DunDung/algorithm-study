package baekjoon.math;

import java.util.Scanner;

//최소공배수
public class Q13241 {

	static long gcd(long a, long b) {
		if(b==0)
			return a;
		return gcd(b, a%b);
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long a = scan.nextLong();
		long b = scan.nextLong();
		System.out.println(a*b/gcd(a, b));
		
	}

}
