package baekjoon.divide_and_conquer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//종이의 개수
public class Q1780 {
	static int minus = 0;
	static int zero = 0;
	static int one = 0;

	static void check(int[][]a, int n, int x, int y) {
		int k = a[x][y];
		boolean isOk = true;
		loop:
			for(int i=0; i<n; i++) {
				for(int j=0; j<n; j++) {
					if(a[x+i][y+j] != k) {
						isOk=false;
						break loop;
					}
				}
			}
		if(!isOk) {
			for(int i=0; i<n; i++) {
				for(int j=0; j<n; j++) {
					check(a, n/3, x+i, y+j);
				}
			}
		}
		else {
			if(k==-1)
				minus++;
			if(k==0) 
				zero++;
			if(k==1)
				one++;
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		int [][]a = new int[n][n];

		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(reader.readLine());
			for(int j=0; j<n; j++)
				a[i][j] = Integer.parseInt(st.nextToken());
		}
		
		for(int i=0; i<n; i+=3) {
			for(int j=0; j<n; j+=3) {
				check(a, n/3, i, j);
			}
		}
		System.out.println(minus);
		System.out.println(zero);
		System.out.println(one);
	}

}
