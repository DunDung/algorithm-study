package baekjoon.simulation;

import java.io.*;
import java.util.*;

//미세먼지 안녕!
public class Q17144 {
	static int n;
	static int m;
	static int t;
	static int [][] a; // 초기배열
	static int [][] spread; // 확산된배열
	static int [] tx = {-1, 1, 0, 0};
	static int [] ty = {0, 0, -1, 1};

	public static void fineDust() {
		spread[2][0] = -1;
		spread[3][0] = -1;
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				if(a[i][j] > 0) {
					int cnt = 0;
					for(int k=0; k<4; k++) {
						if(i+tx[k]<n && i+tx[k]>=0 && j+ty[k]<m && j+ty[k]>=0) {
							if(a[i+tx[k]][j+ty[k]] != -1) {
								cnt++;
								spread[i+tx[k]][j+ty[k]]+= a[i][j]/5;
							}
						}
					}
					spread[i][j] += a[i][j] - (a[i][j]/5)*cnt;
				}
			}
		}
	}
	public static void upCycle() {
		int up = 2;
		int right = m-1;
		int down = 2;
		int left = m-1;
		int cnt = 0;
		int x = 2;
		int y = 0;
		while(!(up==0 && right==0 && down==0 && left==0)) {
			cnt++;
			if(up != 0) {
				x--;
				up--;
			} else if(right != 0) {
				y++;
				right--;
			} else if(down != 0) {
				x++;
				down--;
			} else if(left != 0) {
				y--;
				left--;
			}
			if(t >= cnt) {
				spread[x][y] = 0;
			} else {
				break;
			}
		}
	}
	public static void downCycle() {
		int down = n-3+1;
		int right = m-1;
		int up = n-3+1;
		int left = m-1;
		int cnt = 0;
		int x = 3;
		int y = 0;
		while(!(up==0 && right==0 && down==0 && left==0)) {
			cnt++;
			if(down != 0) {
				x++;
				down--;
			} else if(right != 0) {
				y++;
				right--;
			} else if(up != 0) {
				x--;
				up--;
			} else if(left != 0) {
				y--;
				left--;
			}
			if(t >= cnt) {
				spread[x][y] = 0;
			} else {
				break;
			}
		}
	}
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(reader.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		t = Integer.parseInt(st.nextToken());
		a = new int[n][m];
		spread = new int[n][m];
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(reader.readLine());
			for(int j=0; j<m; j++) {
				a[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		fineDust();
		upCycle();
		downCycle();
		int sum = 0;
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				System.out.print(spread[i][j]+" ");
			}
			System.out.println();
		}
	}

}
