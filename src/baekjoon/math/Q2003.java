package baekjoon.math;

import java.util.Scanner;

//수들의 합 2
public class Q2003 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int [] a = new int[n];
		int cnt = 0;
		
		for(int i=0; i<n; i++)
			a[i] = scan.nextInt();
		
		for(int i=0; i<n; i++) {
			int sum = 0;
			for(int j=i; j<n; j++) {
				sum+=a[j];
				if(m==sum)
					cnt++;
				if(m<sum)
					break;
			}
		}
		System.out.println(cnt);
	}

}
