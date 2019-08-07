package baekjoon.union_find;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//바이러스
//유니온 파인드로 풀기
public class Q2606 {
	public static int [] parent;
	
	public static int find(int x) {
		if(parent[x] == x)
			return x;
		return parent[x] = find(parent[x]);
	}
	
	public static void union(int x, int y) {
		x = find(x);
		y = find(y);
		if(x != y) {
			parent[y] = x;
		}
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		parent = new int[n+1];
		for(int i=1; i<=n; i++) {
			parent[i] = i;
		}
		int m = Integer.parseInt(reader.readLine());
		for(int i=0; i<m; i++) {
			StringTokenizer st = new StringTokenizer(reader.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			union(x, y);
		}
		int ans = 0;
		for(int i=2; i<=n; i++) {
			if(find(1) == find(i)) {
				ans++;
			}
		}
		System.out.println(ans);
	}
}