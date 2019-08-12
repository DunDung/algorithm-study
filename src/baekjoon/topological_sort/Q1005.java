package baekjoon.topological_sort;

import java.io.*;
import java.util.*;

//ACM 크래프트
//X
public class Q1005 {
	public static int target; // 승리 위한 건물 번호
	public static int [] cost; //비용
	public static int [] in; //들어오는 간선
	public static int [] value; // 건물당 지어지는 시간
	
	public static int topologicalSort(List<Integer>[] graph, int n) {
		Queue<Integer> q = new LinkedList<>();
		for(int i=1; i<=n; i++) {
			if(in[i] == 0) {
				q.add(i);
				value[i] = cost[i];
			}
		}
		while(!q.isEmpty()) {
			int v = q.poll();
			for(int k : graph[v]) {
				value[k] = Math.max(value[k], value[v]+cost[k]);
				if(--in[k] == 0) {
					q.add(k);
				}
			}
		}
		return value[target];
	}

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(reader.readLine());
		StringBuilder sb = new StringBuilder();

		while(tc-- > 0) {
			StringTokenizer st = new StringTokenizer(reader.readLine());
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			cost = new int[n+1];
			in = new int[n+1];
			value = new int[n+1];
			List<Integer>[] graph = new ArrayList[n+1];

			for(int i=1; i<=n; i++) {
				graph[i] = new ArrayList<>();
			}
			st = new StringTokenizer(reader.readLine());
			for(int i=1; i<=n; i++) {
				cost[i] = Integer.parseInt(st.nextToken());
			}
			for(int i=0; i<m; i++) {
				st = new StringTokenizer(reader.readLine());
				int x = Integer.parseInt(st.nextToken());
				int y = Integer.parseInt(st.nextToken());
				graph[x].add(y);
				in[y]++; 
			}
			target = Integer.parseInt(reader.readLine());
			sb.append(topologicalSort(graph, n)+"\n");
		}
		System.out.print(sb.toString());
	}
}
