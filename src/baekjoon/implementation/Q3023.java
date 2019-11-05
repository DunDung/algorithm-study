package baekjoon.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//¸¶¼ú»ç ÀÌ¹ÎÇõ
public class Q3023 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		char[][] cards = new char[n*2][m*2];
		
		for(int i=0; i<n; i++) {
			String input = br.readLine();
			for(int j=0; j<m; j++) {
				cards[i][j] = input.charAt(j);
				cards[i][m*2-j-1] = cards[i][j];
				cards[n*2-i-1][j] = cards[i][j];
				cards[n*2-i-1][m*2-j-1] = cards[i][j];
			}
		}
		st = new StringTokenizer(br.readLine());
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<n*2; i++) {
			for(int j=0; j<m*2; j++) {
				if(x-1==i && y-1==j) {
					cards[i][j] = cards[i][j]=='.' ? '#' : '.';
				}
				sb.append(cards[i][j]);
			}
			sb.append("\n");
		}
		System.out.print(sb.toString());
	}

}
