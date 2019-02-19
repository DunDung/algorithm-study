package baekjoon;

import java.util.Scanner;

public class Q5063 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		for(int i=0; i<t; i++) {
			int r =scan.nextInt();
			int e =scan.nextInt();
			int c =scan.nextInt();
			
			if(e>r+c)
				System.out.println("advertise");
			else if(e<r+c)
				System.out.println("do not advertise");
			else
				System.out.println("does not matter");
		}
	}
}
