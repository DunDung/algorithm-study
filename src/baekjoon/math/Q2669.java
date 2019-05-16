package baekjoon.math;

import java.util.Scanner;

//직사각형 네개의 합집합의 면적 구하기
public class Q2669 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int [][] a = new int[100][100];
		for(int tc=0; tc<4; tc++) {
			int y1 = scan.nextInt()-1;
			int x1 = scan.nextInt()-1;
			int y2 = scan.nextInt()-1;
			int x2 = scan.nextInt()-1;
			for(int i=x1; i<x2; i++) {
				for(int j=y1; j<y2; j++) {
					a[i][j] = 1;
				}
			}
		}
		int cnt = 0;
		for(int i=0; i<100; i++)
			for(int j=0; j<100; j++) {
				if(a[i][j]==1)
					cnt++;
			}
		
		System.out.println(cnt);
	}

}
