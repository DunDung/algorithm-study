package baekjoon.math;

import java.util.Scanner;

//최대공약수
public class Q1850 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long num1 = sc.nextLong();
		long num2 = sc.nextLong();

		long low = Math.min(num1, num2);
		long min = 1;

		for (int i = 1; i <= low; i++) {
			if (num1 % i == 0 && num2 % i == 0) {
				min = i;
			}
		}

		for(int i=0; i<min; i++) {
			System.out.print("1");
		}

	}
}
