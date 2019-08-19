package baekjoon.samsung;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//주사위 굴리기
public class Q14499 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(reader.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int [][] a = new int[n][m];
		int [] dice = new int[7];
		
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(reader.readLine());
			for(int j=0; j<m; j++) {
				a[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		if(a[x][y] == 0) {
			a[x][y] = dice[6];
		} else {
			dice[6] = a[x][y];
			a[x][y] = 0;
		}
		
		st = new StringTokenizer(reader.readLine());
		while(k-->0) {
			int dir = Integer.parseInt(st.nextToken());
			int [] clone = dice.clone();
			if(dir == 1) {
				if(y+1 < m) {
					dice[6] = clone[3];
					dice[1] = clone[4];
					dice[3] = clone[1];
					dice[4] = clone[6];
					y++;
				} else continue;
			} else if(dir == 2) {
				if(y-1 >=0) {
					dice[6] = clone[4];
					dice[1] = clone[3];
					dice[3] = clone[6];
					dice[4] = clone[1];
					y--;
				} else continue;
			} else if(dir == 3) {
				if(x-1 >=0) {
					dice[2] = clone[1];
					dice[1] = clone[5];
					dice[5] = clone[6];
					dice[6] = clone[2];
					x--;
				} else continue;
			} else {
				if(x+1 < n) {
					dice[2] = clone[6];
					dice[1] = clone[2];
					dice[5] = clone[1];
					dice[6] = clone[5];
					x++;
				} else continue;
			}
			if(a[x][y] == 0) {
				a[x][y] = dice[6];
			} else {
				dice[6] = a[x][y];
				a[x][y] = 0;
			}
			System.out.println(dice[1]);
		}
	}
}
