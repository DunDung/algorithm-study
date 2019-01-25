package baekjoon;

import java.util.Scanner;

public class Q2908 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		
		StringBuilder a1 = new StringBuilder(a);
		StringBuilder b1 = new StringBuilder(b);
		
		int a2 = Integer.parseInt(a1.reverse().toString());
		int b2 = Integer.parseInt(b1.reverse().toString());
		
		System.out.println((a2>b2)?a2:b2);


	}

}
