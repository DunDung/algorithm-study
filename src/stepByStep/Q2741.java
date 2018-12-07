package stepByStep;

import java.util.Scanner;

public class Q2741 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		print(n);
	}
	public static void print(int n) {
		if(n>0) {
			print(n-1);
			System.out.println(n);
		}
	}
}
