package baekjoon.exhaustive_search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q3980 {
	static int max;

	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(reader.readLine());
		StringBuilder sb = new StringBuilder();
		while(tc-- > 0) {
			int [][] a = new int[11][11];
			for(int i=0; i<11; i++) {
				StringTokenizer st = new StringTokenizer(reader.readLine());
				for(int j=0; j<11; j++) {
					a[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			max = 0;
			dfs(a, 0, 0, 0);
			System.out.println(max);
		}
	}
	public static void dfs(int[][]a, int r, int sum, int bit) {
		if(r==11) {
			max = Math.max(max, sum);
			return;
		}
		for(int i=0; i<11; i++) {
			if(a[r][i] == 0 || (bit & (1<<i)) > 0)	{
				continue;
			}
			dfs(a, r+1, sum+a[r][i], bit | (1<<i));
		}
	}

}
