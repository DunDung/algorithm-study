package baekjoon.exhaustive_search;

import java.util.Scanner;

//N-Queen
//X
public class Q9663 {
	static boolean [] checkCol = new boolean[15];
	static boolean [] checkRightDig = new boolean[40];
	static boolean [] checkLeftDig = new boolean[40];
	static int n;
	
	public static boolean check(int row, int col) {
		if(checkCol[col]) { 
			return false;
		}
		if(checkRightDig[row+col]) {
			return false;
		}
		if(checkLeftDig[row-col+n]) {
			return false;
		}
		return true;
	}
	
	public static int calc(int row) {
		if(row == n) {
			return 1;
		}
		
		int cnt = 0;
		for(int col=0; col<n; col++) {
			if(check(row, col)) {
				checkCol[col] = true;
				checkRightDig[row+col] = true;
				checkLeftDig[row-col+n] = true;
				cnt += calc(row+1);
				checkCol[col] = false;
				checkLeftDig[row+col] = false;
				checkRightDig[row-col+n] = false;
			}
		}
		return cnt;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt(); 
		System.out.println(calc(0));
	}
}
