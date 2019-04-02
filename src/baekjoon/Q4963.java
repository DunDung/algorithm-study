package baekjoon;

import java.util.Scanner;

public class Q4963 {

	static void dfs(int[][] a, boolean [][]b) {
		for(int i=0; i<a.length; i++)
			for(int j=0; j<a[i].length; j++) {
				if(a[i][j]==1 && !b[i][j]) {
					b[i][j] = true;
				}
			}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while(true) {
			int w = scan.nextInt();
			int h = scan.nextInt();

			if(w==0 && h==0)
				break;

			boolean [][] b = new boolean[h][w];
			int [][] island = new int[h][w]; 

			for(int i=0; i<h; i++) {
				for(int j=0; j<w; j++) 
					island[i][j] = scan.nextInt();
			}
			dfs(island, b, 0);

		}
	}

}
