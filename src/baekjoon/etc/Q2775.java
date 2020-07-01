package baekjoon.etc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q2775 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<Integer> list = new ArrayList<>();
		int sum = 0;
		int t = scan.nextInt();
		for(int i=0; i<t; i++) {
			int k = scan.nextInt();
			int n = scan.nextInt();
			int [] a = new int [n];
			for(int j = 0; j<n; j++)
				a[j] = j+1; // 1 2 3
			
			for(int q = 0; q<k; q++) {
				int [] temp = new int[n];
				for(int b = 0; b<n; b++) {
					sum += a[b];
					temp[b] = sum;
				}
				sum = 0;
				a=temp;
			}
			list.add(a[n-1]);
		}
		for(int m : list)
			System.out.println(m);
	}
}
