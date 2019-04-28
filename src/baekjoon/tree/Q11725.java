package baekjoon.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

//트리의 부모 찾기
//bfs를 이용한다.
//X
public class Q11725 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		List<Integer> [] list = (List<Integer>[])new ArrayList[n+1];
		boolean [] b = new boolean[n+1];
		int [] parent = new int[n+1];
		Queue<Integer> q = new LinkedList<>();
		
		for(int i=0; i<n+1; i++)
			list[i] = new ArrayList<>();
		
		for(int i=0; i<n-1; i++) {
			int v1 = scan.nextInt();
			int v2 = scan.nextInt();
			list[v1].add(v2);
			list[v2].add(v1);
		}

		q.add(1); 
		while(!q.isEmpty()) {
			int v = q.poll();
			
			for(int k : list[v]) {
				if(!b[k]) {
					q.add(k);
					parent[k] = v;
					b[k] = true;
				}				
			}
		}
		
		for(int i=2; i<=n; i++)
			System.out.println(parent[i]);
	}

}
