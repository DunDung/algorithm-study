package baekjoon.graph;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

//DFS와 BFS
//인접 리스트로 그래프 구현
//DFS, BFS 기억이 나지않아 공부 후 풀이
public class Q1260_verAdjacencyList {
	static void dfs(List<Integer> [] list, boolean [] b, int v) {
		if(b[v])
			return;
		b[v] = true;
		System.out.print(v+" ");

		for(int n : list[v])
			if(!b[n])
				dfs(list, b, n);
	}

	static void bfs(List<Integer>[] list, boolean [] b, int v) {
		Queue<Integer> q = new LinkedList<>();

		q.offer(v);
		b[v] =true;

		while(!q.isEmpty()) {
			v = q.poll(); //v에 poll을 안넣어줘서 틀렸었음 v에 poll을 해줘야 다음 노드를 다시 for문 돌린다..
			System.out.print(v+" ");

			for(int n : list[v])
				if(!b[n]) {
					q.offer(n);
					b[n] = true;
				}
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int v = scan.nextInt();
		boolean [] b = new boolean[n+1];
		List<Integer> [] list = (List<Integer>[]) new LinkedList[n+1];

		for(int i=0; i<n+1; i++)
			list[i] = new LinkedList<>();

		for(int i=0; i<m; i++) {
			int v1 = scan.nextInt();
			int v2 = scan.nextInt();
			list[v1].add(v2);
			list[v2].add(v1);
		}
		
		for(int i=0; i<n+1; i++) //정렬안해서 틀렸었음.
			Collections.sort(list[i]); //방문할 수 있는 정점이 여러개인 경우 가장 작은 것부터 방문해야 하기 때문에 sort
		
		dfs(list, b, v);
		Arrays.fill(b, false);//틀렸었다. dfs를 수행하며 바뀐 boolean배열을 다시 false로 초기화 
		System.out.println();
		bfs(list, b, v);

		scan.close();
	}

}
