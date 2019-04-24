package baekjoon.implementation;

import java.util.Scanner;

public class Q5032 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int e = scan.nextInt();
		int f = scan.nextInt();
		int c = scan.nextInt();

		int count = (e+f)/c;
		int left = (e+f)%c+count;
		while(left>=c) {
			count+=left/c;
			left = (left%c)+(left/c);
		}
		System.out.println(count);
	}

}
