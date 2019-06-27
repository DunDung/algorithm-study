package baekjoon.dp;

import java.util.Scanner;

//LCS2
//X
public class Q9252 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char [] a = scan.nextLine().toCharArray();
		char [] b = scan.nextLine().toCharArray();
		
		int [][] lcs = new int[a.length+1][b.length+1];
		String [][] solution = new String[a.length+1][b.length+1];
		
		for(int i=1; i<=a.length; i++) {
			for(int j=1; j<=b.length; j++) {
				if(a[i-1]==b[j-1]) {
					lcs[i][j] = lcs[i-1][j-1]+1;
					solution[i][j] = "dig";
				} else {
					lcs[i][j] = Math.max(lcs[i-1][j], lcs[i][j-1]);
					if(lcs[i][j] == lcs[i-1][j]) {
						solution[i][j] = "top";
					} else {
						solution[i][j] = "left";
					}
				}
			}
		}
		
		int n = a.length;
		int m = b.length;
		StringBuilder sb = new StringBuilder();
		
		while(solution[n][m] != null) {
			if(solution[n][m].equals("dig")) {
				sb.append(a[n-1]);
				n--;
				m--;
			} else if(solution[n][m].equals("top")) {
				n--;
			}  else if(solution[n][m].equals("left")) {
				m--;
			} 
		}
		System.out.println(lcs[a.length][b.length]);
		System.out.println(sb.reverse().toString());
	}

}
