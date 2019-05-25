package baekjoon.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

//»∏¿Â ªÃ±‚
public class Q2660 {

	static int bfs(List<Integer>[] list, int start, int n) {
		Queue<Integer> q = new LinkedList<>();
		boolean [] b = new boolean[n+1];
		int cnt = 0;
		q.add(start);
		b[start] = true;
		int check = 1;
		while(check < n) {
			cnt++;
			List<Integer> a = new ArrayList<>();
			while(!q.isEmpty()) {
				a.add(q.poll());
			}
			for(int i=0; i<a.size(); i++) {	
				for(int k : list[a.get(i)]) {
					if(!b[k]) {
						q.add(k);
						b[k] = true;
						check++;
					}
				}
			}
		}
		return cnt;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		List<Integer>[] list = (List<Integer>[])new ArrayList[n+1];
		int [] a = new int[n+1];
		
		for(int i=1; i<=n; i++)
			list[i] = new ArrayList<>();

		while(true) {
			int v1 = scan.nextInt();
			int v2 = scan.nextInt();

			if(v1 == -1 && v2 == -1)
				break;

			list[v1].add(v2);
			list[v2].add(v1);
		}
		int min = Integer.MAX_VALUE;
		int cnt = 0;
		for(int i=1; i<=n; i++) {
			a[i] = bfs(list, i, n);
			if(a[i] < min) {
				min = a[i];
				cnt = 0;
			}
			if(a[i] == min) {
				cnt++;
			}
		}
		System.out.println(min+" "+cnt);
		for(int i=1; i<=n; i++) {
			if(a[i] == min)
				System.out.print(i+" ");
		}
	}
}
