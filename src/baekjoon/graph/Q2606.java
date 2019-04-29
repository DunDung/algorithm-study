package baekjoon.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

//바이러스
//bfs를 이용
public class Q2606 {
	static int bfs(List<Integer>[] list, int start) {
		boolean [] b = new boolean[list.length];
		int cnt = 0;
		Queue<Integer> q = new LinkedList<>();
		q.add(start);
		b[start] = true;
		
		while(!q.isEmpty()) {
			int v = q.poll();
			for(int k : list[v])
				if(!b[k]) {
					b[k]=true;
					q.add(k);
					cnt++;
				}
		}
		return cnt;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		List<Integer>[] list = (List<Integer>[])new ArrayList[n+1];
		
		for(int i=0; i<=n; i++)
			list[i] = new ArrayList<>();
		
		for(int i=0; i<m; i++) {
			int v1 = scan.nextInt();
			int v2 = scan.nextInt();
			list[v1].add(v2);
			list[v2].add(v1);
		}
		
		System.out.println(bfs(list, 1));

	}

}
