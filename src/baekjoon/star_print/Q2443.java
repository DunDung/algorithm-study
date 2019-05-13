package baekjoon.star_print;

import java.util.Scanner;

//º° Âï±â -6
public class Q2443 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int blank = 0;
		for(int i=n; i>=0; i--) {
			for(int j=0; j<blank; j++)
				System.out.print(" ");
			for(int j=i*2-1; j>=1; j--)
				System.out.print("*");
			System.out.println();
			blank++;
		}
	}

}
