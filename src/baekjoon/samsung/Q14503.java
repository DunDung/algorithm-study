package baekjoon.samsung;

import java.util.Scanner;

//·Îº¿Ã»¼Ò±â
public class Q14503 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int x = scan.nextInt();
		int y = scan.nextInt();
		int dir = scan.nextInt();
		int [][] a = new int[n][m];
		boolean [][] b = new boolean[n][m];
		int [] d = {0, 1, 2, 3};
		int [] dx = {-1, 0, 1, 0};
		int [] dy = {0, 1, 0, -1};
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				a[i][j] = scan.nextInt();
			}
		}

		int ans = 0;
		int cnt = 0;
		while(true) {
			if(a[x][y] == 0 && !b[x][y]) { // 1
				ans++;
				b[x][y] = true;
			}

			boolean ok = false;
			loop:{ // 2a / 2b
				for(int i=0; i<4; i++) {
					dir = (dir+3)%4;
					for(int k=0; k<4; k++) { 
						if(x+dx[k]>=0 && x+dx[k]<n && y+dy[k]>=0 && y+dy[k]<m) {
							if(d[k] == dir && a[x+dx[k]][y+dy[k]] == 0 && !b[x+dx[k]][y+dy[k]]) {
								x+=dx[k];
								y+=dy[k];
								ok = true;
								break loop;
							}
						}
					}
				}
			}
			
			if(!ok) { //2c / 2d
				if(dir==0 && a[x+1][y] != 1) {
					x++;
				} else if(dir==1 && a[x][y-1] != 1) {
					y--;
				} else if(dir==2 && a[x-1][y] != 1) {
					x--;
				} else if(dir==3 && a[x][y+1] != 1) {
					y++;
				} else { 
					break;
				}
			}
		}
		System.out.println(ans);
	}
}
