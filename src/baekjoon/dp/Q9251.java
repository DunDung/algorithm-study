package baekjoon.dp;

import java.util.Scanner;

//LCS
//X
public class Q9251 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char [] a = scan.nextLine().toCharArray();
		char [] b = scan.nextLine().toCharArray();
		
		int [][] lcs = new int[a.length+1][b.length+1];
		
		for(int i=1; i<=a.length; i++) {
			for(int j=1; j<=b.length; j++) {
				if(a[i-1] == b[j-1]) {
					lcs[i][j] = lcs[i-1][j-1]+1;
				} else {
					lcs[i][j] = Math.max(lcs[i][j-1], lcs[i-1][j]);
				}
			}
		}
		System.out.println(lcs[a.length][b.length]);
	}
}
