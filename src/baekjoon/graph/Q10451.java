package baekjoon.graph;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//순열 사이클
public class Q10451 {
	static int count ;
	static void dfs(List<Integer> [] list, boolean [] b, int v) {
		if(b[v]) 
			return;
		
		b[v] = true;
		dfs(list, b, list[v].get(0));
		
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int tc = scan.nextInt();
		
		for(int t = 0; t<tc; t++) {
			count = 0;
			int n = scan.nextInt();
			List<Integer> [] list = (List<Integer> [])new ArrayList[n+1];
			boolean [] b = new boolean[n+1];
			
			for(int i=1; i<=n; i++)
				list[i] = new ArrayList<>();
			
			for(int i=1; i<=n; i++)
				list[i].add(scan.nextInt());
			
			for(int i=1; i<=n; i++) {
				if(!b[i]) {
					dfs(list, b, i);
					count++;
				}
			}
			
			
			System.out.println(count);
		}
	}

}
