package baekjoon.implementation;

import java.util.Scanner;

//»ç°ú
public class Q10833 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int sum = 0;
		
		for(int i=0; i<n; i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			sum += b%a;
		}
		System.out.println(sum);
	}

}
