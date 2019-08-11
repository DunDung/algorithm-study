package baekjoon.topological_sort;

import java.io.*;
import java.util.*;

//줄 세우기
//X
public class Q2252 {
	public static Stack<Integer> s = new Stack<>();
	
	public static void dfs(List<Integer>[] list, boolean[] visited, int v) {
		visited[v] = true;
		for(int k : list[v]) {
			if(!visited[k]) {
				dfs(list, visited, k);
			}
		}
		s.push(v);
	}
	public static void main(String[] args) throws Exception{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		List<Integer> [] list = new ArrayList[n+1];
		boolean [] visited = new boolean[n+1];
		
		for(int i=1; i<=n; i++) {
			list[i] = new ArrayList<>();
		}
		
		for(int i=0; i<m; i++) {
			st = new StringTokenizer(bf.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			list[x].add(y);
		}
		for(int i=1; i<=n; i++) {
			if(!visited[i])
				dfs(list, visited, i);
		}
		StringBuilder sb = new StringBuilder();
		while(!s.isEmpty()) {
			sb.append(s.pop()+" ");
		}
		System.out.print(sb.toString());
	}

}
