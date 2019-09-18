package baekjoon.samsung;

import java.io.*;
import java.util.*;

//인구 이동
public class Q16234 {
	static int[][] a;
	static int N,L,R;
	static int[] tx = {1, -1, 0, 0};
	static int[] ty = {0, 0, 1, -1};
	static int ans = 0;
	static int sum = 0;
	static int cnt = 0;
	static boolean[][] visited;
	static List<Integer> list;
	
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(reader.readLine());
		N = Integer.parseInt(st.nextToken());
		L = Integer.parseInt(st.nextToken());
		R = Integer.parseInt(st.nextToken());
		a = new int[N][N];
		visited = new boolean[N][N];
		list = new ArrayList<>();
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(reader.readLine());
			for(int j=0; j<N; j++) {
				a[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		while(true) {
			boolean flag = false;
			for(int i=0; i<N; i++) {
				for(int j=0; j<N; j++) {
					if(!visited[i][j]) {
						dfs(i, j);
					}
					if(!flag && cnt>1) {
						flag = true;
					}
					for(int k=0; k<list.size(); k++) {
						int r = list.get(k)/N;
						int c = list.get(k)%N;
						a[r][c] = sum/cnt;
					}
					sum = 0;
					cnt = 0;
					list.clear();
				}
			}
			if(!flag) break; 
			ans++;
			visited = new boolean[N][N];
		}
		System.out.println(ans);
	}
	static void dfs(int r, int c) {
		list.add(r*N+c);
		visited[r][c] = true;
		cnt++;
		sum += a[r][c];
		for(int k=0; k<4; k++) {
			if(r+tx[k]>=0 && r+tx[k]<N && c+ty[k]>=0 && c+ty[k]<N) {
				if(!visited[r+tx[k]][c+ty[k]]) {
					int gap = Math.abs(a[r][c] - a[r+tx[k]][c+ty[k]]);
					if(gap>=L && gap <=R) {
						dfs(r+tx[k], c+ty[k]);
					}
				}
			}
		}
	}
}
