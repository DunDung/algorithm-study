package baekjoon.implementation;

import java.util.Scanner;

//숫자 정사각형
public class Q1051 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int[][] a = new int[n][m];
		int size = n<m ? n-1 : m-1;

		for(int i=0; i<n; i++) {
			String s = scan.next();
			for(int j=0; j<m; j++)
				a[i][j] = s.charAt(j)-'0';
		}
		
		while(size>0) {
			boolean isOk = false;
			for(int i=0; i<n; i++) {
				for(int j=0; j<m; j++) {
					if(i+size < n && j+size <m)
						if(a[i][j] == a[i][j+size])
							if(a[i][j] == a[i+size][j])
								if(a[i][j] == a[i+size][j+size]) {
									isOk = true;
								}
				}
			}
			if(isOk)
				break;
			
			size --;
		}
		
		size++;
		System.out.println(size*size);

	}
}
