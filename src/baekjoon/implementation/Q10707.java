package baekjoon.implementation;

import java.util.Scanner;

public class Q10707 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int y = scan.nextInt();
		int c = scan.nextInt();
		int d = scan.nextInt();
		int p = scan.nextInt();
		
		int price = 0;
		if(p>c) 
			price = (p-c)*d+y;
		
		else 
			price = y;
		
		price = price<p*x ? price :p*x;
		System.out.println(price);
	}
}
