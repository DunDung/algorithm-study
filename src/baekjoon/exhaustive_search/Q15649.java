package baekjoon.exhaustive_search;

import java.util.*;
import java.io.*;

//N°ú M (1)
public class Q15649 {
	static int N;
	static int M;
	static int[] nums;
	static boolean[] visited;
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		visited = new boolean[N+1];
		nums = new int[M];
		backTrack(0);
		System.out.print(sb.toString());
	}
	
	public static void backTrack(int cnt) {
		if(cnt==M) {
			for(int v : nums) {
				sb.append(v+" ");
			}
			sb.append("\n");
			return;
		}
		
		for(int i=1; i<=N; i++) {
			if(!visited[i]) {
				nums[cnt] = i;
				visited[i] = true;
				backTrack(cnt+1);
				visited[i] = false;
			}
		}
	}
}