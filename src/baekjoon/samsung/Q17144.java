package baekjoon.samsung;

import java.io.*;
import java.util.*;

//미세먼지 안녕!
public class Q17144 {
	static int n;
	static int m;
	static int t;
	static int [][] a; 
	static int [] tx = {-1, 1, 0, 0};
	static int [] ty = {0, 0, -1, 1};
	static int r; //공기청정기 위치

	public static int [][] fineDust() {
		int [][] spread = new int[n][m];
		spread[r][0] = -1;
		spread[r+1][0] = -1;
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
		return spread;
	}
	
	public static void cycle() {
		for(int i=r-1; i>0; i--) {
			a[i][0] = a[i-1][0];
		}
		for(int i=r+1+2; i<n; i++) {
			a[i-1][0] = a[i][0];
		}
		for(int i=0; i<m-1; i++) {
			a[0][i] = a[0][i+1];
			a[n-1][i] = a[n-1][i+1];
		}
		for(int i=0; i<r; i++) {
			a[i][m-1] = a[i+1][m-1];
		}
		for(int i=n-1; i>r+1; i--) {
			a[i][m-1] = a[i-1][m-1];
		}
		for(int i=m-1; i>1; i--) {
			a[r][i] = a[r][i-1];
			a[r+1][i] = a[r+1][i-1];
		}
		a[r][1]=0;
		a[r+1][1]=0;
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(reader.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		t = Integer.parseInt(st.nextToken());
		a = new int[n][m];
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(reader.readLine());
			for(int j=0; j<m; j++) {
				a[i][j] = Integer.parseInt(st.nextToken());
				if(a[i][j] == -1 && r==0) {
					r = i;
				}
			}
		}
		for(int i=0; i<t; i++) {
			a = fineDust();
			cycle();
		}
		int sum = 0;
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				if(a[i][j] > 0) {
					sum += a[i][j];
				}
			}
		}
		System.out.println(sum);
	}

}
