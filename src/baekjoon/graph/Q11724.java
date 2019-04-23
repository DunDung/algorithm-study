package baekjoon.graph;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

//연결 요소의 개수
//X
public class Q11724 {
	static void dfs(List<Integer> [] list, boolean [] b, int v) {
		if(b[v])
			return;
		b[v] = true;
		
		for(int n : list[v])
			if(!b[n])
				dfs(list, b, n);
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int v = scan.nextInt();
		int m = scan.nextInt();
		int count = 0;
		boolean [] b = new boolean[v+1];
		List<Integer> [] list = (List<Integer>[]) new LinkedList[v+1];

		for(int i=1; i<=v; i++)
			list[i] = new LinkedList<>();

		for(int i=0; i<m; i++) {
			int v1 = scan.nextInt();
			int v2 = scan.nextInt();
			list[v1].add(v2);
			list[v2].add(v1);
			
		}
		for(int i=1; i<=v; i++)
			if(!b[i]) { //이 부분 생각못함. if문
				dfs(list, b, i);
				count++;
			}
		System.out.println(count);
	}

}
