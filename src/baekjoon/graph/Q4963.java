package baekjoon.graph;

import java.util.Scanner;

//섬의 개수
public class Q4963 {
	static int [][] a;
	static boolean [][] b;

	static void dfs(int i, int j) {
		if(b[i][j])
			return;

		b[i][j] = true;

		if(i-1>=0 && a[i-1][j]>0 && !b[i-1][j])//위
			dfs(i-1, j);
		if(i-1>=0 && j-1 >=0 && a[i-1][j-1]>0 && !b[i-1][j-1]) //왼쪽 위 대각선
			dfs(i-1, j-1);
		if(i-1>=0 && j+1<a[i-1].length && a[i-1][j+1]>0 && !b[i-1][j+1]) //오른쪽 위 대각선
			dfs(i-1, j+1);
		if(j-1>=0 && a[i][j-1]>0 && !b[i][j-1]) //왼쪽
			dfs(i, j-1);
		if(j+1<a[i].length && a[i][j+1]>0 && !b[i][j+1]) //오른쪽
			dfs(i, j+1);
		if(i+1 < a.length && a[i+1][j]>0 && !b[i+1][j]) //아래
			dfs(i+1, j);
		if(i+1 < a.length && j-1>=0 && a[i+1][j-1]>0 && !b[i+1][j-1]) //왼쪽 아래 대각선
			dfs(i+1 ,j-1);
		if(i+1 < a.length && j+1<a[i+1].length && a[i+1][j+1]>0 && !b[i+1][j+1]) //오른쪽 아래 대각선
			dfs(i+1, j+1);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while(true) {
			int w = scan.nextInt();
			int h = scan.nextInt();

			if(w==0 && h==0)
				break;

			b = new boolean[h][w];
			a = new int[h][w]; 

			for(int i=0; i<h; i++)
				for(int j=0; j<w; j++)
					a[i][j] = scan.nextInt();

			int cnt = 0; //이어진 섬의 개수
			for(int i=0; i<h; i++)
				for(int j=0; j<w; j++)
					if(!b[i][j] && a[i][j]>0) {
						cnt++;
						dfs(i, j);
					}

			System.out.println(cnt);
		}
	}

}
