package baekjoon.implementation;

import java.util.Scanner;

public class Q2851 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int [] mushRoom = new int[10];
		int sum = 0;

		for(int i=0; i<10; i++)
			mushRoom[i] = scan.nextInt();

		for(int i=0; i<10; i++) {
			sum += mushRoom[i];
			if(sum > 100) {
				if(Math.abs(100 - (sum - mushRoom[i])) < Math.abs(100-sum)) {
					System.out.println(sum-mushRoom[i]);
				}
				else
					System.out.println(sum);
				break;
			}

			if(sum == 100) {
				System.out.println(sum);
				break;
			}
		}
		if(sum<100)
			System.out.println(sum);
	}
}
