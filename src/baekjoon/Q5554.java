package baekjoon;

import java.util.Scanner;

public class Q5554 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		for(int i=0; i<4; i++)
			sum+=scan.nextInt();
		
		System.out.println(sum/60);
		System.out.println(sum%60);
	}
}
