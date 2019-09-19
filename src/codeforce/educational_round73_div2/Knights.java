package codeforce.educational_round73_div2;

import java.util.*;

public class Knights {
	static int n;
	static char[][] map;
	static int cnt = 0;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		map = new char[n][n];
		int a = 0;
		int b = n-1;
		while(a>=0 && a<n && b>=0 && b<n) {
			map[a][a] = 'W';
			if()
			map[a][b] = 'W';
			map[b][a] = 'W';
			map[b][b] = 'W';
			a++;
			b--;
		}
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(map[i][j]=='W') {
					System.out.print("W");
				}else {
					System.out.print("B");
				}
			}
			System.out.println();
		}
	}
}
