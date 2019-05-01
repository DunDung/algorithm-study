package baekjoon.implementation;

import java.util.Scanner;

//¥ﬁ∆ÿ¿Ã
public class Q1913 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int target = scan.nextInt();
		int tx = 0;
		int ty = 0;
		int z = n*n;
		int min = 0;
		int max = n-1;
		Ω«∆–
		int [][] a = new int[n][n];
		boolean [][] b = new boolean[n][n];

		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(min == i)
					a[j][i] = z--; 
			}
		}
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++)
				System.out.print(a[i][j]+" ");
			System.out.println();
		}
		System.out.println(tx+" "+ty);
	}
}
