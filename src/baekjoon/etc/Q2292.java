package baekjoon.etc;

import java.util.Scanner;

public class Q2292 {
	static int range = 1;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		if(n>=1 && n<= 1000000000) {
			int count = 1;
			while(n>range) {
				range += 6*count;
				count ++;
			}
			System.out.println(count);

		}
	}
}