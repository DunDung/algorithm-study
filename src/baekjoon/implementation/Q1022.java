package baekjoon.implementation;

import java.util.Scanner;

//소용돌이 예쁘게 출력하기
public class Q1022 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int r1 = scan.nextInt();
		int c1 = scan.nextInt();
		int r2 = scan.nextInt();
		int c2 = scan.nextInt();
		int n = (r2-r1)+1;
		int m = (c2-c1)+1;
		int x =Math.abs(r1);
		int y =Math.abs(c1);
		int [][]a = new int[n][m];
		int [] dir = {1, 1, 2, 2};
		int cnt = 1;
		int count = 0;
		int max = 0;

		loop:{
			while(true) {
				for(int i=0; i<4; i++) {
					for(int j=0; j<dir[i]; j++) {
						if(x>=0 && x<n && y>=0 && y<m) {
							a[x][y] = cnt;
							count++;
							if(count == n*m) break loop;
						}
						if(i==0) {
							y++;
						} else if(i==1) {
							x--;
						} else if(i==2) {
							y--;
						}else {
							x++;
						}
						cnt++;
					}
					dir[i]+=2;
				}
			}
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}
