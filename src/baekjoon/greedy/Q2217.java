package baekjoon.greedy;

import java.util.Arrays;
import java.util.Scanner;

//ทฮวม
public class Q2217 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int [] a = new int[n];
		
		for(int i=0; i<n; i++) {
			a[i] = scan.nextInt();
		}
		
		Arrays.sort(a);
		int max = a[n-1];
		for(int i=0; i<=n-1; i++) {
			max = Math.max(a[i]*(n-i), max);
		}
		System.out.println(max);
	}
}
