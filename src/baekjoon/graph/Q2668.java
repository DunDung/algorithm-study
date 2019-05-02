package baekjoon.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

//숫자고르기
public class Q2668 {
	static int n;
	static Set<Integer> bfs(List<Integer>[] list, int v, int start) {
		Queue<Integer> q = new LinkedList<>();
		boolean []b = new boolean[n+1];
		Set<Integer> a =new TreeSet<>();
		q.add(v);
		b[v] = true;
		a.add(v);
		while(!q.isEmpty()) {
			int k = q.poll();
			for(int z :list[k]) {
				if(start == z)
					break;
				if(b[z]) {
					a.clear();
					break;
				}
				else {
					if(!b[z]) {
						a.add(z);
						q.add(z);
						b[z] = true;
					}
				}
			}
		}
		return a;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		List<Integer>[] list = (List<Integer>[])new ArrayList[n+1];

		for(int i=1; i<=n; i++) {
			list[i] = new ArrayList<>();
			list[i].add(scan.nextInt());
		}
		
		Set<Integer> ans = new TreeSet<>();
		for(int i=1; i<=n; i++) 
			ans.addAll(bfs(list, i, i));
		
		System.out.println(ans.size());
		for(int k : ans)
			System.out.println(k);
	}

}
