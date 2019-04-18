package baekjoon.sort;

import java.util.Arrays;
import java.util.Scanner;

//보물
public class Q1026 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int [] a = new int[n];
		int [] b = new int[n];
		int sum = 0;

		for(int i=0; i<n; i++)
			a[i] = scan.nextInt();
		for(int i=0; i<n; i++)
			b[i] = scan.nextInt()*-1; //b배열에 입력받을 때 -1 곱해주기

		Arrays.sort(a);
		Arrays.parallelSort(b);
		
		for(int i=0; i<n; i++)
			sum += a[i]*(b[i]*-1);

		System.out.println(sum);
	}
}
