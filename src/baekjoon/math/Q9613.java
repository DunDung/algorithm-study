package baekjoon.math;

import java.util.Scanner;

//GCD гу
public class Q9613 {

	static int gcd(int a, int b) {
		if(b==0)
			return a;
		return gcd(b, a%b);
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int tc = scan.nextInt();
		
		for(int t=0; t<tc; t++) {
			int n = scan.nextInt();
			int [] a = new int[n];
			long sum = 0;
			
			for(int i=0; i<n; i++)
				a[i] = scan.nextInt();
			
			for(int i=0; i<n; i++) {
				for(int j=i+1; j<n; j++)
					sum+=gcd(a[i], a[j]);
			}
			System.out.println(sum);
		}
	}
}