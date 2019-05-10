package baekjoon.greedy;

import java.util.Scanner;

//대회or인턴
public class Q2875 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int k = scan.nextInt();

		k-= n%2;
		n /=2;

		while(k>0) {
			if(n>m || n==m) {
				k-=2;
				n--;
			}
			else if(n<m) {
				k--;
				m--;
			}
		}
		System.out.println(Math.min(n,m));
	}
}
