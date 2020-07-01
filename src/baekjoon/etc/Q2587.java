package baekjoon.etc;

import java.util.Arrays;
import java.util.Scanner;

public class Q2587 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int [] array = new int[5];
		for(int i=0; i<5; i++)
			array[i] = scan.nextInt();
		
		Arrays.sort(array);
		System.out.println(average(array));
		System.out.println(array[2]);

	}
	static int average(int [] a) {
		int sum = 0;
		for(int n : a)
			sum += n;
		return sum/5;
	}
}
