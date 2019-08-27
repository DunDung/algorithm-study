package baekjoon.exhaustive_search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//ÆùÆ®
public class Q9997 {
	static int result = 0;
	static int [] a ;
	static int n ;
	static int ans = 0;
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(reader.readLine());
		a = new int[n];
		for(int i=0; i<26; i++) {
			result = result | (1<<i);
		}
		for(int i=0; i<n; i++) {
			String temp = reader.readLine();
			for(int j=0; j<temp.length(); j++) {
				a[i] = a[i]|(1<<temp.charAt(j)-'a');
			}
		}
		dfs(-1, 0);
		System.out.println(ans);
	}
	public static void dfs(int idx, int sum) {
		if(idx==n-1) {
			if(sum == result) {
				ans++;
			}
			return;
		}
		dfs(idx+1, sum|a[idx+1]);
		dfs(idx+1, sum);
	}

}
