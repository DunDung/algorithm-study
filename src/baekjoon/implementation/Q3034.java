package baekjoon.implementation;

import java.util.Scanner;

public class Q3034 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int w = scan.nextInt();
		int h = scan.nextInt();
		double diagonal =Math.sqrt((w*w)+(h*h));
		
		for(int i=0; i<n; i++) {
			if(diagonal>=scan.nextDouble())
				System.out.println("DA");
			else
				System.out.println("NE");
		}
		
	}

}
