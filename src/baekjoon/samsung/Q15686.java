package baekjoon.samsung;

import java.io.*;
import java.util.*;
//치킨 배달
public class Q15686 {
	static int n;
	static int m;
	static List<List<Integer>> chickenList = new ArrayList<>();
	static List<Integer> chickens = new ArrayList<>();
	static List<Integer> homes = new ArrayList<>();
	static int[] tx = {1, -1, 0, 0};
	static int[] ty = {0, 0, -1, 1};
	static int min = Integer.MAX_VALUE;
	
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(reader.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(reader.readLine());
			for(int j=0; j<n; j++) {
				int v = Integer.parseInt(st.nextToken());
				if(v == 2) chickens.add((i*n)+j);
				else if(v == 1) homes.add((i*n)+j);
			}
		}
		dfs(new int[m], 0, 0);
		System.out.println(min);
	}
	
	static void dfs(int[] temp, int idx, int cnt) {
		if(cnt==m) {
			int sum = 0;
			for(int i=0; i<homes.size(); i++) {
				sum += bfs(temp, homes.get(i));
				if(sum > min) break;
			}
			min = Math.min(sum, min);
			return;
		}
		if(idx >= chickens.size()) return;
		temp[cnt]=chickens.get(idx);
		dfs(temp, idx+1, cnt+1);
		dfs(temp, idx+1, cnt);
	}
	static int bfs(int[] temp, int idx) {
		int dist = Integer.MAX_VALUE;
		int r1 = idx/n;
		int c1 = idx%n;
		for(int i=0; i<temp.length; i++) {
			int r2 = temp[i]/n;
			int c2 = temp[i]%n;
			dist = Math.min(dist, Math.abs(r1-r2)+Math.abs(c1-c2));
		}
		return dist;
	}
}
