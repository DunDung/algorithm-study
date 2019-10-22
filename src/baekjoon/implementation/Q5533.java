package baekjoon.implementation;

import java.io.*;
import java.util.*;

//¿Ø¥œ≈©
public class Q5533 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[][] input = new int[n][3];
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=0; j<3; j++) {
				input[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		int[] ans = new int[n];
		for(int i=0; i<3; i++) {
			boolean[] check = new boolean[n];
			Map<Integer, Integer> map = new HashMap<>();
			for(int j=0; j<n; j++) {
				if(map.containsKey(input[j][i])) {
					check[j] = true;
					check[map.get(input[j][i])] = true;
				}
				map.put(input[j][i], j);
			}
			for(int j=0; j<n; j++) {
				if(!check[j]) {
					ans[j]+=input[j][i];
				}
			}
		}
		StringBuilder sb = new StringBuilder();
		for(int k : ans) {
			sb.append(k+"\n");
		}
		System.out.print(sb.toString());
		
	}

}
