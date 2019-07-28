package baekjoon.exhaustive_search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//체스판 다시 칠하기
public class Q1018 {
	static char [][] white = new char[8][8];
	static char [][] black = new char[8][8];
	static int ans = Integer.MAX_VALUE;
	
	public static void buildChess() {
		int k = 0;
		for(int i=0; i<8; i++) {
			for(int j=0; j<8; j++) {
				if(k%2 == 0) {
					white[i][j] = 'W';
				} else {
					white[i][j] = 'B';
				}
				k++;
			}
			k++;
		}
		k = 1;
		for(int i=0; i<8; i++) {
			for(int j=0; j<8; j++) {
				if(k%2 == 0) {
					black[i][j] = 'W';
				} else {
					black[i][j] = 'B';
				}
				k++;
			}
			k++;
		}
	}
	public static void compare(char [][] a, int x, int y) {
		int cnt = 0;
		for(int i=0; i<8; i++) {
			for(int j=0; j<8; j++) {
				if(a[i+x][j+y] != white[i][j]) {
					cnt++;
				}
			}
		}
		ans = Math.min(ans, cnt);
		cnt = 0;
		for(int i=0; i<8; i++) {
			for(int j=0; j<8; j++) {
				if(a[i+x][j+y] != black[i][j]) {
					cnt++;
				}
			}
		}
		ans = Math.min(ans, cnt);
		
	}
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(reader.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		char [][] a = new char[n][m];
		
		for(int i=0; i<n; i++) {
			String s = reader.readLine();
			for(int j=0; j<m; j++) {
				a[i][j] = s.charAt(j);
			}
		}
		
		buildChess();
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				if(i+8 <= n && j+8 <= m) {
					compare(a, i, j);
				}
			}
		}
		System.out.println(ans);
		
	}

}
