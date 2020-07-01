package baekjoon.etc;

import java.util.Scanner;

public class Q2845 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		int n =scan.nextInt();
		for(int i=0; i<5; i++)
			System.out.print(scan.nextInt()-(t*n)+" ");
	}

}
