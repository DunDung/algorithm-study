package baekjoon;

import java.util.Scanner;

public class Q10984 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		
		for(int i=0; i<t; i++) {
			int total = 0;
			double grade = 0;
			int subject = scan.nextInt();
			for(int j=0; j<subject; j++) {
				int g = scan.nextInt();
				double p = scan.nextDouble();
				
				total += g;
				grade += (double)p*g;
			}
			System.out.printf("%d %.1f\n", total, grade/total);
		}

	}

}
