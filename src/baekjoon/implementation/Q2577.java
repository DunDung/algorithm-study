package baekjoon.implementation;

import java.util.Scanner;

public class Q2577 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int [] n = new int[10];
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int result = a*b*c;
		String s = String.valueOf(result);
		for(int i=0; i<s.length(); i++) {
			n[s.charAt(i)-'0']++;
		}
		for(int v : n)
			System.out.println(v);
	}
}
