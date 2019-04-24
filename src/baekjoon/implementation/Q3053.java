package baekjoon.implementation;

import java.util.Scanner;

public class Q3053 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int r = scan.nextInt();
		System.out.printf("%6f\n", r*r*3.14159265358979323846);
		System.out.printf("%6f", (double)r*r*2);
		
	}
}
