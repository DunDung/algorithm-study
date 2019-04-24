package baekjoon.graph;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//다리만들기
//X
//어렵다
public class Q2146 {
	public static final int[] dx = {0, 0, 1, -1};
	public static final int[] dy = {1, -1, 0, 0};

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[][] a = new int[n][n]; //입력받은 배열
		int[][] d = new int[n][n]; //거리
		int[][] g = new int[n][n]; //섬 그룹
		
		for (int i=0; i<n; i++) 
			for (int j=0; j<n; j++) 
				a[i][j] = scan.nextInt();

		int cnt = 0;
		for (int i=0; i<n; i++) {
			for (int j=0; j<n; j++) {
				if (a[i][j] == 1 && g[i][j] == 0) {
					Queue<Dot> q = new LinkedList<Dot>();
					g[i][j] = ++cnt;
					q.add(new Dot(i, j));
					while (!q.isEmpty()) {
						Dot p = q.remove();
						int x = p.x;
						int y = p.y;
						for (int k=0; k<4; k++) {
							int nx = x+dx[k];
							int ny = y+dy[k];
							if (0 <= nx && nx < n && 0 <= ny && ny < n) {
								if (a[nx][ny] == 1 && g[nx][ny] == 0) {
									q.add(new Dot(nx, ny));
									g[nx][ny] = cnt;
								}
							}
						}
					}
				}
			}
		}
		Queue<Dot> q = new LinkedList<Dot>();
		for (int i=0; i<n; i++) {
			for (int j=0; j<n; j++) {
				d[i][j] = -1;
				if (a[i][j] == 1) {
					q.add(new Dot(i,j));
					d[i][j] = 0;
				}
			}
		}
		while (!q.isEmpty()) {
			Dot p = q.remove();
			int x = p.x;
			int y = p.y;
			for (int k=0; k<4; k++) {
				int nx = x+dx[k];
				int ny = y+dy[k];
				if (0 <= nx && nx < n && 0 <= ny && ny < n) {
					if (d[nx][ny] == -1) {
						d[nx][ny] = d[x][y] + 1;
						g[nx][ny] = g[x][y];
						q.add(new Dot(nx,ny));
					}
				}
			}
		}
		int ans = -1;
		for (int i=0; i<n; i++) {
			for (int j=0; j<n; j++) {
				for (int k=0; k<4; k++) {
					int x = i+dx[k];
					int y = j+dy[k];
					if (0 <= x && x < n && 0 <= y && y < n) {
						if (g[i][j] != g[x][y]) {
							if (ans == -1 || ans > d[i][j] + d[x][y]) {
								ans = d[i][j] + d[x][y];
							}
						}
					}
				}
			}
		}
		for (int i=0; i<n; i++) {
			for (int j=0; j<n; j++) {
				System.out.println(g[i][j]+" ");
			}
			System.out.println();
		}
		for (int i=0; i<n; i++) {
			for (int j=0; j<n; j++) {
				System.out.print(g[i][j]+" ");
			}
			System.out.println();
		}
		for (int i=0; i<n; i++) {
			for (int j=0; j<n; j++) {
				System.out.print(d[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		
		System.out.println(ans);
	}
}
class Dot {
	int x;
	int y;

	public Dot(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
