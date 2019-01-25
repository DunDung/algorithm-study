package baekjoon;

import java.util.Scanner;

public class Q2839 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		if(n >= 3 && n<=5000)
			System.out.println(sugarDelivery(n));

	}
	public static int sugarDelivery(int n) {
		int value = n % 5;
		int result = n / 5;
		while(true) {
			if(value > n)
				return -1;
			if(value == 0)
				return result;
			if(value % 3 == 0)
				return result + value/3;
			else {
				value += 5;
				result--;
			}
		}
	}
}
