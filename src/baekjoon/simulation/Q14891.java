package baekjoon.simulation;

import java.io.*;
import java.util.*;

//Åé´Ï¹ÙÄû
public class Q14891 {
	static int [][] a = new int [4][8];

	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		for(int i=0; i<4; i++) {
			String input = bf.readLine();
			for(int j=0; j<8; j++) {
				a[i][j] = input.charAt(j)-'0';
			}
		}
		int k = Integer.parseInt(bf.readLine());
		while(k-- > 0) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			int idx = Integer.parseInt(st.nextToken());
			int dir = Integer.parseInt(st.nextToken());
			int [] rotations = new int[4];
			boolean [] visited = new boolean[4];
			dfs(idx-1, dir, rotations, visited);
			for(int i=0; i<4; i++) {
				rotate(i, rotations[i]);
			}
		}
		int ans = 0;
		int score = 1;
		for(int i=0; i<4; i++) {
			if(a[i][0] == 1) ans += score;
			score*=2;
		}		
		System.out.println(ans);
	}
	static void dfs(int idx, int dir, int [] rotations, boolean [] visited) {
		rotations[idx] = dir;
		visited[idx] = true;
		if(idx-1>=0 && !visited[idx-1]) {
			if(a[idx][6] != a[idx-1][2]) {
				dfs(idx-1, dir*-1, rotations, visited);
			}
		} 
		if(idx+1<4 && !visited[idx+1]) {
			if(a[idx][2] != a[idx+1][6]) {
				dfs(idx+1, dir*-1, rotations, visited);
			}
		}
	}
	static void rotate(int idx , int dir) {
		if(dir == 0) return;
		int[] temp = new int[8]; 
		if(dir== -1) {
			System.arraycopy(a[idx], 1, temp, 0, 7);
			temp[7] = a[idx][0];
		} else if(dir == 1) {
			System.arraycopy(a[idx], 0, temp, 1, 7);
			temp[0] = a[idx][7];
		}
		for(int i=0; i<8; i++) {
			a[idx][i] = temp[i];
		}
	}
}