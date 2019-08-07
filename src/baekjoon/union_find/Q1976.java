package baekjoon.union_find;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//여행 가자
public class Q1976 {
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
		int m = Integer.parseInt(reader.readLine()); //여행 계획
		for(int i=1; i<=n; i++) {
			StringTokenizer st = new StringTokenizer(reader.readLine());
			for(int j=1; j<=n; j++ ) {
				int k = Integer.parseInt(st.nextToken());
				if(k == 1) {
					union(i, j);
				}
			}
		}
		StringTokenizer st = new StringTokenizer(reader.readLine());
		int k = Integer.parseInt(st.nextToken());
		boolean isOk = true;
		for(int i=1; i<m; i++) {
			if(find(k) != find(Integer.parseInt(st.nextToken()))) {
				isOk = false;
				break;
			}
		}
		if(isOk) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}

}
