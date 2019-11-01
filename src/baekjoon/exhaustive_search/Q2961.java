package baekjoon.exhaustive_search;


import java.util.*;
import java.io.*;

//도영이가 만든 음식
public class Q2961 {
	static int n;
	static int[] S;
	static int[] B;
	static long min = Long.MAX_VALUE;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		S = new int[n];
		B = new int[n];
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			S[i] = Integer.parseInt(st.nextToken());
			B[i] = Integer.parseInt(st.nextToken());
		}
		dfs(1, 0, 0, 0);
		System.out.println(min);
	}
	public static void dfs(long s, long b, int idx, int cnt) {
		if(cnt > 0)min = Math.min(min, Math.abs(s-b));
		if(idx==n) return;
		dfs(s*S[idx], b+B[idx], idx+1, cnt+1);
		dfs(s, b, idx+1, cnt);
	}
}