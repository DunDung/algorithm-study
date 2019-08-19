package baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//P¹è¿­
public class Q1566 {
	public static int n;
	public static int m;
	public static int[][]a;

	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String [] input = reader.readLine().split(" ");
		n = Integer.parseInt(input[0]);
		m = Integer.parseInt(input[1]);
		a = new int[n][m];
		for(int i=0; i<n; i++) {
			input = reader.readLine().split(" ");
			for(int j=0; j<m; j++) {
				a[i][j] = Integer.parseInt(input[j]);
			}
		}
		int cnt = 0;
		while(cnt <= n+m) {
			int min = Integer.MAX_VALUE;
			int x = 0;
			int y = 0;
			boolean isOk = true;
			for(int i=0; i<n; i++) {
				int sum = 0;
				for(int j=0; j<m; j++) {
					sum+=a[i][j];
					if(min > a[i][j]) {
						min = a[i][j];
						x = i;
						y = j;
					}
				}
				if(sum < 1) {
					isOk = false;
				}
			}
			for(int i=0; i<m; i++) {
				int sum = 0;
				for(int j=0; j<n; j++) {
					sum+=a[j][i];
				}
				if(sum < 1) {
					isOk = false;
				}
			}
			int sum = 0;
			for(int i=0; i<m; i++) {
				sum += a[x][i];
			}
			if(sum < 1) {
				for(int i=0; i<m; i++) {
					a[x][i] *= -1;
				}
				cnt++;
				continue;
			}
			sum = 0;
			for(int i=0; i<n; i++) {
				sum += a[i][y];
			}
			if(sum < 1) {
				for(int i=0; i<n; i++) {
					a[i][y] *= -1;
				}
				cnt++;
				continue;
			}
			if(isOk) break;
		}
		if(cnt>n+m) {
			System.out.println(-1);
		} else {
			System.out.println(cnt);
		}
	}

}
