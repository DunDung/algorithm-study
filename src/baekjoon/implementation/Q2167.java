package baekjoon.implementation;

import java.util.Scanner;

//2차원 배열의 합
public class Q2167 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int[][] a = new int[n+1][m+1];
		
		for(int i=1; i<=n; i++)
			for(int j=1; j<=m; j++)
				a[i][j] = scan.nextInt();
		
		int tc = scan.nextInt();
		
		while(tc-->0) {
			int nStart = scan.nextInt();
			int mStart = scan.nextInt();
			int nEnd = scan.nextInt();
			int mEnd = scan.nextInt();
			int sum = 0;
			
			for(int i=nStart; i<=nEnd; i++)
				for(int j=mStart; j<=mEnd; j++)
					sum += a[i][j];
			
			System.out.println(sum);
		}

	}

}
