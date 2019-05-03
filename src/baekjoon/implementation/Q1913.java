package baekjoon.implementation;

import java.util.Scanner;

//¥ﬁ∆ÿ¿Ã
public class Q1913 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int target = scan.nextInt();
		int[][] a = new int[n][n];
		int up = 1;
		int right = 1;
		int down = 2;
		int left = 2;
		int x = n/2;
		int y = n/2;
		int start = 1;
		int tx=0;
		int ty=0;
		a[x][y] = start++;

		loop:
			while(true) {
				for(int i=0; i<up; i++) {
					a[--x][y] = start++;
					if(x==0 && y==0)
						break loop;
				}
				for(int i=0; i<right; i++)
					a[x][++y] = start++;
				for(int i=0; i<down; i++)
					a[++x][y] = start++;
				for(int i=0; i<left; i++)
					a[x][--y] = start++;
				up+=2;
				right+=2;
				down+=2;
				left+=2;
			}

		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(a[i][j] == target) {
					tx = i+1;
					ty = j+1;
				}
				System.out.print(a[i][j]+" ");
			}			
			System.out.println();
		}
		System.out.println(tx + " " + ty);
	}
}
