package baekjoon.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//색종이
public class Q2567 {
	실패
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int [][] map = new int[101][101];
		int n = Integer.parseInt(br.readLine());
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			for(int a=x+1; a<=x+10; a++) {
				map[y+1][a] = 1;
				map[y+10][a] = 1;
			}
			for(int b=y+1; b<=y+10; b++) {
				map[b][x+1] = 1;
				map[b][x+10] = 1;
			}
		}
		
		for(int i=1; i<30; i++) {
			for(int j=1; j<30; j++) {
				System.out.print(map[i][j]);
			}
			System.out.println();
		}
		
	}

}
