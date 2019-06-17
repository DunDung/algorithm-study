package baekjoon.exhaustive_search;

import java.util.Arrays;
import java.util.Scanner;

//스도쿠
//시간초과 코드
//X
public class Q2580 {
	public static boolean check(int[][]a) {
		boolean[]b = new boolean[9];
		for(int i=0; i<3; i++) {
			for(int j=0; j<9; j++) {
				Arrays.fill(b, false);
				for(int k=0; k<9; k++) {
					int v = 0;
					if(i==0) { //행 검사
						v = a[j][k];
					}else if(i==1) { //열 검사
						v = a[k][j]; 
					}else {
						v = a[j/3*3+k/3][j%3*3+k%3];
					}
					if(v==0) continue;
					if(b[v-1]) return false;
					b[v-1] = true;
				}
			}
		}
		return true;
	}

	public static void go(int[][]a, int cnt) {
		if(cnt == 81) {
			for(int i=0; i<9; i++) {
				for(int j=0; j<9; j++) {
					System.out.print(a[i][j]+" ");
				}
				System.out.println();
			}
			System.exit(0);
		}
		int row = cnt/9;
		int col = cnt%9;
		int v = a[row][col];
		if(v != 0) { 
			go(a, cnt+1);
		}else {
			for(int i=1; i<=9; i++) {
				a[row][col] = i;
				if(check(a)) {
					go(a, cnt+1);
				}
			}
			a[row][col] = 0;
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[][]a = new int[9][9];
		for(int i=0; i<9; i++) {
			for(int j=0; j<9; j++) {
				a[i][j] = scan.nextInt();
			}
		}
		go(a,0);
		for(int i=0; i<9; i++) {
			for(int j=0; j<9; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}

