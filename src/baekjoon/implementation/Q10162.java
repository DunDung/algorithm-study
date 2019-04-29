package baekjoon.implementation;

import java.util.Arrays;
import java.util.Scanner;

public class Q10162 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = 300;
		int b = 60;
		int c = 10;
		int [] butt = new int[3];
		int t = scan.nextInt();

		if(t>=a) {
			butt[0] += t/a;
			t = t%a;
		}
		if(t>=b) {
			butt[1] += t/b;
			t = t%b;
		}
		if(t>=c) {
			butt[2] += t/c;
			t = t%c;
		}

		if(t!=0)
			System.out.println(-1);
		else {
			for(int k : butt)
				System.out.print(k+" ");
		}
	}
}
