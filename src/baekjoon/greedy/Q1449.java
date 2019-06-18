package baekjoon.greedy;

import java.util.Scanner;

public class Q1449 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();
		int [] a = new int[n];

		for(int i=0; i<n; i++) {
			a[i] = scan.nextInt();
		}
		int v = k-1;
		int cnt = 1;
		for(int i=1; i<n; i++) {
			
			if(a[i]-a[i-1] <= v) {
				v -= a[i]-a[i-1];
			}
			else {
				cnt++;
				v = k-1;
			}
		}
		System.out.println(cnt);

	}

}
